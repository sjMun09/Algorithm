import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int T = Integer.parseInt(br.readLine());
    while (T-- > 0) {
      String S = br.readLine();
      HashSet<Character> set = new HashSet<>();

      for (int i = 0; i < S.length(); i++) {
        set.add(S.charAt(i));
      }

      int total = 0;
      for (int i = 65; i <= 90; i++) {
        if (!set.contains((char) i)) {
          total += i;
        }
      }
      System.out.println(total);
    }
  }
}
