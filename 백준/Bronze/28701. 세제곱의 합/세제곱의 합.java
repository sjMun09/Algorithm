import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int sumOfCubes = 0;

        for(int i = 1; i <= N; i++) {
            sum += i;
            sumOfCubes += i * i * i;
        }

        System.out.println(sum);
        System.out.println(sum * sum);
        System.out.println(sumOfCubes);
    }
}
