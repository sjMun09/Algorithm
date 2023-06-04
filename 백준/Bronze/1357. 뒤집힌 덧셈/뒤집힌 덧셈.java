import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int result = reverseValue(X, Y);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }

    public static int reverseValue(int x, int y) {
        int reversedX = reverseNum(x);
        int reversedY = reverseNum(y);
        int reversedSum = reversedX + reversedY;

        return reverseNum(reversedSum);
    }

    public static int reverseNum(int n) {
        int reversed = 0;

        while (n > 0) {
            reversed *= 10;
            reversed += n % 10;
            n /= 10;
        }

        return reversed;
    }
}