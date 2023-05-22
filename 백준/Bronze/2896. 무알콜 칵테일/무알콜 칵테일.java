import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] juiceInput = br.readLine().split(" ");
        String[] rateInput = br.readLine().split(" ");

        int[] juice = new int[3];
        int[] rate = new int[3];

        for (int i = 0; i < 3; i++) {
            juice[i] = Integer.parseInt(juiceInput[i]);
        }

        for (int i = 0; i < 3; i++) {
            rate[i] = Integer.parseInt(rateInput[i]);
        }

        double cup = Math.min(juice[0] / (double) rate[0], Math.min(juice[1] / (double) rate[1], juice[2] / (double) rate[2]));

        for (int i = 0; i < 3; i++) {
            bw.write((juice[i] - cup * rate[i]) + (i < 2 ? " " : "\n"));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}