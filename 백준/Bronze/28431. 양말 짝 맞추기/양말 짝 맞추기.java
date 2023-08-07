import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> socks = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            int sockNumber = Integer.parseInt(br.readLine());
            socks.put(sockNumber, socks.getOrDefault(sockNumber, 0) + 1);
        }
        int remainingSock = -1;
        for (Map.Entry<Integer, Integer> entry : socks.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                remainingSock = entry.getKey();
                break;
            }
        }
        System.out.print(remainingSock);
    }
}
