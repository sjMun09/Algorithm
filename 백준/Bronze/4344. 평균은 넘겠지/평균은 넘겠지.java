import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(br.readLine());
        // 이렇게 해야 계속 문자열 분리해서 받을 수 있음.
        StringTokenizer st;

        for (int i = 0; i < C; i++) {

            st = new StringTokenizer(br.readLine()," ");
            // 이 부분이 문제였다 int N을 받을 떄, `br.readLine()`으로 매 문장으로 반복하니까 런타임이 뜨는 것이다.
            // 따라서 st.nextToken()으로 바꿔준다.
            // 주의하자 ! , 사소하면서도 이런 디테일을 놓쳤다.
            int N = Integer.parseInt(st.nextToken());
            int[] score = new int[N];
            int sum =0;
            for (int j = 0; j < N; j++) {
                score[j] = Integer.parseInt(st.nextToken());
                sum += score[j];
            }
            // 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림해서 소수 3째자리 까지 출력.
            // -> 각 케이스마다 평균을 구해야함.
            float avg = (float) sum/N;
            float count =0;

            for (int k = 0; k < N; k++) {
                if (score[k] > avg) {
                    count++;
                }
            }
            float ratio = (count / N) *100;
            System.out.printf("%.3f", ratio);
            System.out.println("%");
        }
    }
}

