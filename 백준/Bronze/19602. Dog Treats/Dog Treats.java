import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] treats = IntStream.range(0, 3)
                                .map(i -> {
                                    try {
                                        return Integer.parseInt(br.readLine());
                                    } catch (Exception e) {
                                        throw new RuntimeException(e);
                                    }
                                })
                                .toArray();

        int happiness = IntStream.range(0, treats.length)
                                 .map(i -> treats[i] * (i + 1))
                                 .sum();

        System.out.print(happiness >= 10 ? "happy" : "sad");
    }
}
