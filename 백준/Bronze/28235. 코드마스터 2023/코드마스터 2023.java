import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().trim();
        String[] inputs = input.split(" ");

        for (String word : inputs) {
            switch (word) {
                case "SONGDO":
                    System.out.print("HIGHSCHOOL ");
                    break;
                case "CODE":
                    System.out.print("MASTER ");
                    break;
                case "2023":
                    System.out.print("0611 ");
                    break;
                case "ALGORITHM":
                    System.out.print("CONTEST ");
                    break;
            }
        }
        System.out.println();
    }
}
