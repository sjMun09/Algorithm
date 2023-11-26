import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      int p = Integer.parseInt(br.readLine());
      int maxPrice = 0;
      String ePlayer = "";

      for (int j = 0; j < p; j++) {
        String[] info = br.readLine().split(" ");
        int price = Integer.parseInt(info[0]);
        String name = info[1];

        if (price > maxPrice) {
          maxPrice = price;
          ePlayer = name;
        }
      }

      System.out.println(ePlayer);
    }
  }
}
