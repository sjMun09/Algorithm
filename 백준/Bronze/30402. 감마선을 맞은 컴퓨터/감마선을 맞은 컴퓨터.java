import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] pix = new String[15][15];
        for (int i = 0; i < 15; i++) {
            pix[i] = br.readLine().split(" ");
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (pix[i][j].equals("w")) {
                    System.out.println("chunbae");
                    return;
                }
                if (pix[i][j].equals("b")) {
                    System.out.println("nabi");
                    return;
                }
                if (pix[i][j].equals("g")) {
                    System.out.println("yeongcheol");
                    return;
                }
            }
        }
    }
}
