import java.io.*;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int appleScore = IntStream.rangeClosed(1, 3)
                .map(i -> {
                    try {
                        return (4 - i) * Integer.parseInt(br.readLine());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                })
                .sum();

        int bananaScore = IntStream.rangeClosed(1, 3)
                .map(i -> {
                    try {
                        return (4 - i) * Integer.parseInt(br.readLine());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                })
                .sum();

        System.out.println(appleScore > bananaScore ? 'A' : appleScore < bananaScore ? 'B' : 'T');
    }
}
