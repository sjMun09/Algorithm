import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String sentence = br.readLine();
            String[] words = sentence.split(" ");
            StringBuilder yodaSentence = new StringBuilder();

            for (int j = 2; j < words.length; j++) {
                yodaSentence.append(words[j]).append(" ");
            }
            yodaSentence.append(words[0]).append(" ").append(words[1]);

            System.out.println(yodaSentence.toString());
        }
    }
}