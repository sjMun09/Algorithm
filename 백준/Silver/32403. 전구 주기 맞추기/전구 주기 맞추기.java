import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());  
        int T = Integer.parseInt(st.nextToken()); 

        int[] lights = new int[N]; 

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            lights[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= T; i++) {
            if (T % i == 0) {
                factors.add(i);
            }
        }

        int totalChanges = 0;

        for (int i = 0; i < N; i++) {
            int currentLight = lights[i];
            int minChange = Integer.MAX_VALUE;

            for (int factor : factors) {
                int change = Math.abs(currentLight - factor); 
                minChange = Math.min(minChange, change); 
            }
            totalChanges += minChange;
        }

        System.out.println(totalChanges);
    }
}
