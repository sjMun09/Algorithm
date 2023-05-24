import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toUpperCase();
        String[] dial = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        int totalSeconds = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            for (int j = 0; j < dial.length; j++) {
                if (dial[j].contains(Character.toString(ch))) {
                    totalSeconds += (j+3);
                }
            }
        }
        System.out.print(totalSeconds);
    }
}
