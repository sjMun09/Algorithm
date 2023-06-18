import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int H = Integer.parseInt(input[0]);
        int W = Integer.parseInt(input[1]);
        int[] blocks = new int[W];
        input = br.readLine().split(" ");
        for (int i = 0; i < W; i++) {
            blocks[i] = Integer.parseInt(input[i]);
        }
        int totalRainWater = 0;
        int leftMax = 0;
        int[] leftMaxs = new int[W];
        for (int i = 0; i < W; i++) {
            leftMax = Math.max(blocks[i], leftMax);
            leftMaxs[i] = leftMax;
        }
        int rightMax = 0;
        int[] rightMaxs = new int[W];
        for (int i = W - 1; i >= 0; i--) {
            rightMax = Math.max(blocks[i], rightMax);
            rightMaxs[i] = rightMax;
        }
        for (int i = 0; i < W; i++) {
            int minHeight = Math.min(leftMaxs[i], rightMaxs[i]);
            totalRainWater += minHeight - blocks[i];
        }
        bw.write(Integer.toString(totalRainWater));
        bw.newLine();
        br.close();
        bw.flush();
        bw.close();
    }
}