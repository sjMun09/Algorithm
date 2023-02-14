import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b;
        int c;


        StringTokenizer st;

        for (int i = 1; i <= a; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            System.out.println("Case #" + i + ": " + b + " + " + c + " = " + (b+c));

        }
        br.close();
    }
}