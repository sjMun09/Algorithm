import java.util.*;
import java.io.*;

class Main {
 public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] height = new int[N];

        for (int i = 0; i < N; i++) {
            height[i] = Integer.parseInt(st.nextToken());
        }

        int uphillRoad = 0;
        int index = 0;
        for (int i = 1; i < N; i++) {
            if(height[i-1]<height[i]) {
                index += (height[i]-height[i-1]);
            } else {
                index = 0;
            }
            uphillRoad = Math.max(index, uphillRoad);
        }
        System.out.print(uphillRoad);
    }
}
