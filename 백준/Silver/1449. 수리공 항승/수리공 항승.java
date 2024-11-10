import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        물을 막을 때 사용하는 테이프의 최소 개수 (테이프 겹치기 가능)
        좌우 0.5만큼 덧 칠해야 된다.
        가장 왼쪽에서 정수만큼 떨어진 거리만 물이 샌다.
        첫 줄 - 새는 곳의 갯수 N, 테이프 길이 L
        두 번째 줄 - 위치
        */
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] tape = new int[N];
        for (int i = 0; i < N; i++) {
            tape[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(tape);

        int tapeCnt = 0;
        int position = 0;

        while (position < N) {
            int tapeStart = tape[position];
            tapeCnt++;
            // tapeStart에 붙이면 Llength Tape는 start+L까지 커버 가능
            while (position < N && tape[position] < tapeStart + L) {
                position++;
            }
        }
        System.out.print(tapeCnt);
    }
}
