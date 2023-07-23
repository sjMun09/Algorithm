import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] grid = new int[100][100];

        // 1. 입력 받기: 색종이의 개수
        int N = Integer.parseInt(br.readLine());

        // 2. N개의 색종이에 대한 좌표를 입력 받는다.
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);

            // 3. 해당 색종이를 도화지 위에 놓는다.
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    grid[j][k] = 1;
                }
            }
        }

        // 4. 도화지 위에 있는 색종이의 넓이를 구한다.
        int totalArea = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (grid[i][j] == 1) {
                    totalArea++;
                }
            }
        }

        // 5. 결과 출력
        System.out.println(totalArea);
    }
}
