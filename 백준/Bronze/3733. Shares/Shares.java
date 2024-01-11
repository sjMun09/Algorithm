import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        
        while((input=br.readLine())!=null) {
            String[] values = input.split(" ");
            int N = Integer.parseInt(values[0]);
            int S = Integer.parseInt(values[1]);
            
            int x = S / (N + 1);
            System.out.println(x);
        }
    }
}
