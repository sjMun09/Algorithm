import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.valueOf(st.nextToken());
        long M = Long.valueOf(st.nextToken());

        System.out.print(Math.abs(N - M));
    }
}