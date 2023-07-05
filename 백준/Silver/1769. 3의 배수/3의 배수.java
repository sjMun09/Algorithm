import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        br.close();

        int count = 0;
        while (input.length() > 1) {
            int sum = 0;
            for (int i = 0; i < input.length(); i++) {
                sum += input.charAt(i) - '0';
            }
            input = Integer.toString(sum);
            count++;
        }

        System.out.println(count);

        if (Integer.parseInt(input) % 3 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}