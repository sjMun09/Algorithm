import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> gifts = new PriorityQueue<>(Collections.reverseOrder());

        Stream.generate(() -> {
            try {
                return br.readLine();
            } catch (Exception e) {
                return null;
            }
        })
        .limit(n)
        .map(line -> line.split(" "))
        .forEach(tokens -> {
            int a = Integer.parseInt(tokens[0]);

            if (a == 0) {
                System.out.println(gifts.isEmpty() ? -1 : gifts.poll());
            } else {
                Arrays.stream(tokens, 1, tokens.length)
                      .map(Integer::parseInt)
                      .forEach(gifts::add);
            }
        });
    }
}
