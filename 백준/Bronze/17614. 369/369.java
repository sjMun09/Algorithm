import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        
        for (int i = 1; i <= N; i++) {
            String temp = Integer.toString(i);
            
            for (int j = 0; j < temp.length(); j++) {
                char num = temp.charAt(j);
                if (num == '3' || num == '6' || num == '9') {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
