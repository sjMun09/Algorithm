import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            int end = Integer.parseInt(input.substring(2));

            if (end <= 90) {
                count++;
            }
        }

        System.out.println(count);
    }
}