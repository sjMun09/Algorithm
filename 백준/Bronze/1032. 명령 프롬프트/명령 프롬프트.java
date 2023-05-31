import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] fileNames = new String[n];
      
        for (int i = 0; i < n; i++) {
            fileNames[i] = br.readLine();
        }

        StringBuilder answer = new StringBuilder();
      
        for (int j = 0; j < fileNames[0].length(); j++) {
            char ch = fileNames[0].charAt(j);
            boolean isSame = true;

            for (int i = 1; i < n; i++) {
                if (ch != fileNames[i].charAt(j)) {
                    isSame = false;
                    break;
                }
            }

            if (isSame) {
                answer.append(ch);
            } else {
                answer.append('?');
            }
        }
      
        System.out.println(answer);
    }
}
