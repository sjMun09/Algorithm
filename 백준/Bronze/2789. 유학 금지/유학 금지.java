import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String output = input.replaceAll("[CAMBRIDGE]", "");
        System.out.println(output);
    }
}