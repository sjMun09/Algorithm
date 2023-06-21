import java.io.*;
import java.util.*;
        /*
        1. 입력받기
        2. x,y 소팅
        3. x || y 가 동일할경우 우선순위 처리
        */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine()); // 점의 갯수
        int[][] points = new int[N][2];

        // 1. input
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }
        // 2. sorting
        Arrays.sort(points, Comparator
                        .comparingInt((int[]point)->point[0])
                        .thenComparingInt(point->point[1]));
        // output
        for (int i = 0; i < N; i++) {
            System.out.println(points[i][0]+" "+points[i][1]);
        }
    }
}
