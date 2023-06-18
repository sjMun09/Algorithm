import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] students = new int[n][5];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                students[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int maxStudent = -1;
        int[] maxDays = new int[5];

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                int checkingStudent = 0;

                for (int k = 0; k < n; k++) {
                    if (students[k][i] == 1 && students[k][j] == 1) {
                        checkingStudent++;
                    }
                }

                if (checkingStudent > maxStudent) {
                    maxStudent = checkingStudent;
                    maxDays = new int[]{0, 0, 0, 0, 0};
                    maxDays[i] = 1;
                    maxDays[j] = 1;
                }
            }
        }

        System.out.println(maxStudent);
        for (int i = 0; i < 5; i++) {
            System.out.print(maxDays[i] + " ");
        }
    }
}
