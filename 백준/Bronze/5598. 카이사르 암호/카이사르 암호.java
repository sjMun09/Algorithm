import java.io.*;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArray = br.readLine().toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 65) {
                charArray[i] = 91;
            }
            if (charArray[i] == 66) {
                charArray[i] = 92;
            }
            if (charArray[i] == 67) {
                charArray[i] = 93;
            }
            System.out.print((char)(charArray[i] - 3));
        }
    }
}
