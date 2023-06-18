import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 층수
        int m = Integer.parseInt(st.nextToken()); // 학교의 너비(가로 길이)
        int k = Integer.parseInt(st.nextToken()); // 레이스에 참가하는 반 수
        int[] totalTime = new int[k];
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int f = Integer.parseInt(st.nextToken()); // 학교 층
            int d = Integer.parseInt(st.nextToken()); // 교실 위치
            int stairsTime = 0;
            if (f > 1) { // 계단 내려가는 시간: 1층 아래로 내려갈 때마다 1초가 소요
                stairsTime = (f - 1) * 2;
            }
            int corridorTime = Math.abs(m - d) * 2; // 복도 이동 시간 계산
            totalTime[i] = stairsTime + corridorTime;
        }
        int minTime = totalTime[0];
        int winner = 1;
        for (int i = 1; i < k; i++) {
            if (totalTime[i] < minTime) {
                minTime = totalTime[i];
                winner = i + 1;
            }
        }
        bw.write(String.valueOf(winner));
        br.close();
        bw.flush();
        bw.close();
    }
}
