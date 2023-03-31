import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        // 아파트에 살 수 있는 최대 값을 배열로 초기화
        int[][] APT = new int[15][15];

        // 아파트 생성
        for (int i = 0; i < 15; i++) {
            APT[i][1]=1; // 1 ㅊ으 1호
            APT[0][i]= i;// 0층 1호
        }
        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
            }
        }

        int T = Integer.parseInt(br.readLine());
        for (int k = 0; k < T; k++) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            sb.append(APT[a][b]).append("\n");
        }
        System.out.println(sb);
    }
}

