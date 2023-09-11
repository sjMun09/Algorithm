import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('H', 0);
        map.put('I', 0);
        map.put('A', 0);
        map.put('R', 0);
        map.put('C', 0);

        for (int i = 0; i < N; i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch))
                map.put(ch, map.get(ch) + 1);
        }
        int minCnt = N;
        for (int cnt : map.values()) {
            minCnt = Math.min(minCnt, cnt);
        }
        System.out.print(minCnt);
    }
}