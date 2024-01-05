import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    while (true) {
      int n = Integer.parseInt(br.readLine());
      
      if (n == 0) {
        break;
      }
      
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }
}
