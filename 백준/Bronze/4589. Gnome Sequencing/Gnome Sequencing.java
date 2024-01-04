import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println("Gnomes:");
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int[] nums = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
            int[] sorted = Arrays.stream(nums).sorted().toArray();

            if (Arrays.equals(nums, sorted) || Arrays.equals(nums, reverse(sorted))) {
                System.out.println("Ordered");
            } else {
                System.out.println("Unordered");
            }
        }
    }
    
    private static int[] reverse(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList())
                .stream().mapToInt(i -> i)
                .toArray();
    }
}
