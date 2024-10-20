import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken()); 
        int[][] arr = new int[N][M]; 

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int totalBrushes = 0; 

        for (int i = 0; i < N; i++) {
            int oneCount = 0; 
            int twoCount = 0;
            int currentColor = 0;  // 현재 진행 중인 색 (초기값은 0으로 세팅)

            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 0) {
                    // 색이 없는 부분을 만나면 현재 구간을 마치고 넘어감
                    if (oneCount > 0 || twoCount > 0) {
                        totalBrushes += Math.min(oneCount, twoCount) + 1;
                        oneCount = 0;
                        twoCount = 0;
                    }
                    currentColor = 0;  // 색 x
                } else {
                    // 현재 진행 중인 색 1
                    if (arr[i][j] == 1) {
                        if (currentColor != 1) {
                            oneCount++;
                            currentColor = 1;  // 색 1로 변경
                        }
                    }
                    // 현재 진행 중인 색 2
                    if (arr[i][j] == 2) {
                        if (currentColor != 2) {
                            twoCount++;
                            currentColor = 2;  // 색 2로 변경
                        }
                    }
                }
            }
            // 행이 끝났을 때 남아있는 구간 처리b -> 필수적,
            if (oneCount > 0 || twoCount > 0) {
                totalBrushes += Math.min(oneCount, twoCount) + 1;
            }
        }
        System.out.print(totalBrushes);
    }
}
