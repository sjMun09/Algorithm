import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            int T = Integer.parseInt(br.readLine());
            sb.append(gauss(T)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();

        br.close();
        bw.close();
    }

    public static int gauss(int number) {
        for (int a = 1; ThreeNumber(a) < number; a++) {
            for (int b = 1; ThreeNumber(b) < number; b++) {
                for (int c = 1; ThreeNumber(c) < number; c++) {
                    if (ThreeNumber(a) + ThreeNumber(b) + ThreeNumber(c) == number) {
                        return 1;
                    }
                }
            }
        }
        return 0; 
    }
    public static int ThreeNumber(int n) {
        return n * (n + 1) / 2;
    }
}