import java.io.*;
import java.util.*;
/*

8 9 10 리터인 물통 3개 앞 2 물통은 비어있음. 3번째 물통은 full
c에 담겨있을 수 있는 경우의 수인 물의 양을 모두 구해내는데, 오름차순으로 출력해야한다.
총 6가지
c->a, c->b, b->c, b->a, a->b, a->c
0 9 1 -> 1 : c->b
8 0 2 -> 2 : c->a
0 0 10 -> 10 : b->a
 */
class Main{
    static int A,B, C;
    static boolean[][] visited;
    static boolean[] possible;
    static int volume = 200;
    //dfs 와 bfs 가능할거같음. 난 dfs
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        visited = new boolean[volume + 1][volume + 1];
        possible = new boolean[volume + 1];

        move(0, 0, C);

               StringBuilder sb = new StringBuilder();
               for(int i = 0; i <= C; i++) {
                   if(possible[i]) {
                       sb.append(i).append(' ');
                   }
               }

               System.out.print(sb);
           }

           static void move(int a, int b, int c) {
               if(visited[a][b]) return;
               visited[a][b] = true;

               if(a == 0) possible[c] = true;
               // C -> A
               if(c + a > A) move(A, b, (a + c) - A);
               else move(a + c, b, 0);
               // C -> B
               if(c + b > B) move(a, B, (c + b) - B);
               else move(a, b + c, 0);

               // B -> A
               if(b + a > A) move(A, (a + b) - A, c);
               else move(a + b, 0, c);
               // B -> C
               if(b + c > C) move(a, (b + c) - C, C);
               else move(a, 0, b + c);

               // A -> B
               if(a + b > B) move((a + b) - B, B, c);
               else move(0, a + b, c);
               // A -> C
               if(a + c > C) move((a + c) - C, b, C);
               else move(0, b, a + c);
    }
}
