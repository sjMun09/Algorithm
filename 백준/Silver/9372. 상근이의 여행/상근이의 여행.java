import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Main{
        static int N,M,result;

        // 크루스칼 알고리즘 || DFS,BFS 문제로도 풀 수 있음
        public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
                StringTokenizer st;
                StringBuilder sb = new StringBuilder();

                int T = Integer.parseInt(br.readLine());

                while (T-- > 0) {
                        st = new StringTokenizer(br.readLine());
                        N = Integer.parseInt(st.nextToken());
                        M = Integer.parseInt(st.nextToken());

                        for (int i = 0; i < M; i++) {
                                br.readLine();
                        }
                        sb.append((N-1) + "\n");
                }
                bw.write(sb.toString());
                bw.flush();
                bw.close();
                br.close();

        }
}