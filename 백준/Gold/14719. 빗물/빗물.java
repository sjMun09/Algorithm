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

        // 블록 사이에 쌓인 빗물의 양
        for (int i = 1; i < W - 1; i++) {
            int leftMax = 0, rightMax = 0;
            // 왼쪽 블록 중에서 가장 높은 블록찾음
            for (int j = 0; j < i; j++) {
                leftMax = Math.max(leftMax, blocks[j]);
            }
            // 오른쪽 블록 중에서 가장 높은 블록
            for (int j = i + 1; j < W; j++) {
                rightMax = Math.max(rightMax, blocks[j]);
            }
            // 현재 블록의 양쪽에서 가장 높은 블록 중 더 낮은 블록과 현재 블록 높이의 차이를 구해서 총량에 더하기
            int minHeight = Math.min(leftMax, rightMax);
            if (minHeight > blocks[i]) {
                totalRainWater += minHeight - blocks[i];
            }
        }
        bw.write(Integer.toString(totalRainWater));
        bw.newLine();
        br.close();
        bw.flush();
        bw.close();
    }
}
