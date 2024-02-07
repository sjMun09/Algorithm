import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] mirror = new String[N];

        for(int i = 0; i < N; i++) {
            mirror[i] = br.readLine();
        }

        int K = Integer.parseInt(br.readLine());

        switch(K) {
            case 1:
                for(int i = 0; i < N; i++) {
                    System.out.println(mirror[i]);
                }
                break;
            case 2:
                for(int i = 0; i < N; i++) {
                    StringBuilder sb = new StringBuilder(mirror[i]);
                    System.out.println(sb.reverse().toString());
                }
                break;
            case 3:
                for(int i = N-1; i >= 0; i--) {
                    System.out.println(mirror[i]);
                }
                break;
        }
    }
}
