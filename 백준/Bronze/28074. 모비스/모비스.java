import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        if (map.getOrDefault('M', 0) > 0 && map.getOrDefault('O', 0) > 0 && map.getOrDefault('B', 0) > 0 && map.getOrDefault('I', 0) > 0 && map.getOrDefault('S', 0) > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
