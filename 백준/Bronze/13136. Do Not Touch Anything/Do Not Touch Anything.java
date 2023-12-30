import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long R = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());
        long N = Long.parseLong(st.nextToken());

        long rows = (R % N == 0) ? R / N : R / N + 1;
        long cols = (C % N == 0) ? C / N : C / N + 1;

        System.out.println(rows * cols);
    }
}
