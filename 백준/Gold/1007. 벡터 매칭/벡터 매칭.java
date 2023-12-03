import java.io.*;
import java.util.*;

public class Main {
    static double min;
    static int N;
    static ArrayList<Point> arr;
    static boolean[] check;
    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static void dfs(int index, int count) {
        if (count == 0) {
            double temp = answer();
            min = Math.min(min, temp);
        }
        for (int i = index; i < arr.size(); i++) {
            check[i] = true;
            dfs(i + 1, count - 1);
            check[i] = false;
        }
    }
    static double answer() {
        double x = 0, y = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (check[i]) {
                x += arr.get(i).x;
                y += arr.get(i).y;
            } else {
                x -= arr.get(i).x;
                y -= arr.get(i).y;
            }
        }
        return Math.sqrt((x * x) + (y * y));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            min = Integer.MAX_VALUE;
            arr = new ArrayList<>();
            check = new boolean[N];
            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                arr.add(new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
            }
            dfs(0, N / 2);
            sb.append(min).append("\n");
        }
        System.out.print(sb);
    }
}