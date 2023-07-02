import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[][] twoArray = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            twoArray[i][0] = Integer.parseInt(st.nextToken());
            twoArray[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(twoArray, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return Integer.compare(o1[0], o2[0]);
                }
                return Integer.compare(o1[1], o2[1]);
            }
        });

        for (int[] coordinate : twoArray) {
            sb.append(coordinate[0]).append(" ").append(coordinate[1]).append("\n");
        }

        System.out.print(sb);
    }
}
