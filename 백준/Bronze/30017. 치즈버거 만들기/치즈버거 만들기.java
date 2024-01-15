import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int A = Integer.parseInt(inputs[0]); // 패티
        int B = Integer.parseInt(inputs[1]); // 치즈

        int maxBurgerSize = Math.min(A, B + 1) * 2 - 1;

        System.out.println(maxBurgerSize);
    }
}
