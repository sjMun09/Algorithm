import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        int N = Integer.parseInt(input1[0]);
        int K = Integer.parseInt(input1[1]);

        int[] weights = new int[N];
        String[] input2 = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            weights[i] = Integer.parseInt(input2[i]);
        }

        int maxHappy = getMaxHappy(N, K, weights);
        System.out.print(maxHappy);
    }

    public static int getMaxHappy(int N, int K, int[] weights) {
        Arrays.sort(weights);

        int left = 0;
        int right = N - 1;
        int happyPeople = 0;

        while (left < right) {
            if (weights[left] + weights[right] <= K) {
                happyPeople++;
                left++;
                right--;
            } else {
                right--;
            }
        }
        return happyPeople;
    }
}
