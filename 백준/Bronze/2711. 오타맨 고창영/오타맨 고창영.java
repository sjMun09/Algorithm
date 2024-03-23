import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); 

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int typoPosition = Integer.parseInt(st.nextToken()) - 1; 
            String inputString = st.nextToken();

          
            String correctedString = inputString.substring(0, typoPosition) + inputString.substring(typoPosition + 1);
            System.out.println(correctedString); 
        }
    }
}
