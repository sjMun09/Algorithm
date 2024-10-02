import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Set<String> unlisten = new HashSet<>();
        for (int i = 0; i < N; i++) {
            unlisten.add(br.readLine());
        }
        List<String> unlistenPerson = new ArrayList<>();
            for (int i = 0; i < M; i++) {
            String name = br.readLine();
                if (unlisten.contains(name)) {
                    unlistenPerson.add(name);
                }
            }
                Collections.sort(unlistenPerson);
       
        sb.append(unlistenPerson.size()).append("\n"); 
        for (String name : unlistenPerson) {
            sb.append(name).append("\n"); 
        }
        System.out.print(sb);
    }
}
