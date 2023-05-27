import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arrLength = Integer.parseInt(br.readLine());
        String S = br.readLine();

        String[] arr = new String[arrLength];
        for (int i = 0; i < arrLength; i++) {
          arr[i] = String.valueOf(S.charAt(i));
        }

        int cnt = 0;
        int patternCount = 0;

        for (int i = 1; i < arrLength - 1; i++) {
            if (arr[i - 1].equals("I") && arr[i].equals("O") && arr[i + 1].equals("I")) {
                cnt++;
                i++;
                if (cnt == N) {
                    cnt--;
                    patternCount++;
                }
            } else {
                cnt = 0;
            }
        }

        System.out.println(patternCount);
    }
}
