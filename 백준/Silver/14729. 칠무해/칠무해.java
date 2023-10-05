import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //0.001 ~ 100.000 범위의 입력 처리 위해 TreeMap
        TreeMap<Double, Integer> map = new TreeMap<>();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                double score = Double.parseDouble(st.nextToken());
                map.put(score, map.getOrDefault(score, 0) + 1);
            }
        }

        for (double score : map.keySet()) {
            int occurrences = map.get(score);
            for (int i = 0; i < occurrences; i++) {
                if (cnt < 7) {
                    System.out.printf("%.3f\n", score);
                    cnt++;
                } else {
                    break;
                }
            }
        }
    }
}
