import java.io.*;
import java.util.*;

public class Main{
    static ArrayList<Integer>[] graph;
    static int[] check;

    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        graph = new ArrayList[N+1];
        for(int i = 1; i <= N; i++) graph[i] = new ArrayList<Integer>();
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }
        check = new int[N+1];
        dfs(1);

        if(Arrays.stream(check, 1, N+1).anyMatch(num -> num == 0)){
            for(int i = 1; i <= N; i++){
                if(check[i] == 0){
                    System.out.print(i + " ");
                }
            }
        }else {
            System.out.println(0);
        }
    }
    private static void dfs(int node){
        check[node] = 1;
        for(int next: graph[node]){
            if(check[next] == 0){
                dfs(next);
            }
        }
    }
}
