import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = Arrays.stream(br.readLine().split(" "))
                                      .filter(s -> !s.equals("+") && !s.equals("="))
                                      .map(Integer::parseInt)
                                      .collect(Collectors.toList());

        System.out.println(numbers.get(0) + numbers.get(1) == numbers.get(2) ? "YES" : "NO");
    }
}
