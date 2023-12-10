// 다시 풀어볼 문제 
// 결국 dfs 와 HashMap을 같이 쓰는 문제였음.
// 이전의 나는 재귀 + hashMap으로 문제를 풀려고 노력했었는데 풀리지 않았음.
// 그리고 입력 처리할 때, split으로 " " 나올떄 짜른다는 생각을 하지 못했음.
// dfs 노드를 통해 해당 문제를 해결하였다.
// 아직 hashMap과 LinkedList, ArrayList에 약하니까 좀더 학습하고 활용해보기.
// 이전에는 양방향 그래프로 구현해서 dfs를 진행해서 틀ㄹ렸던 것이다.
// 해당 코드는 단방향 그래프로 구현하고 두 클래스 간의 연결을 각각 확인하는 dfs다.
import java.io.*;
import java.util.*;

public class Main {

    static HashMap<String, ArrayList<String>> map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        map = new HashMap<>();

        for (int i = 0; i < N - 1; i++) {
            String[] input = br.readLine().split(" ");
            String child = input[0];
            String parent = input[1];

            if (!map.containsKey(child)) map.put(child, new ArrayList<>());

            map.get(child).add(parent);
        }

        String[] query = br.readLine().split(" ");
        String start = query[0];
        String end = query[1];

        System.out.println((dfs(start, end) || dfs(end, start)) ? 1 : 0);
    }

    static boolean dfs(String start, String end) {
        Stack<String> stack = new Stack<>();
        HashSet<String> visited = new HashSet<>();

        stack.push(start);

        while (!stack.isEmpty()) {
            String current = stack.pop();

            if (current.equals(end)) return true;
            if (visited.contains(current)) continue;

            visited.add(current);
            if (map.containsKey(current)) {
                for (String neighbor : map.get(current)) {
                    if (!visited.contains(neighbor)) stack.push(neighbor);
                }
            }
        }

        return false;
    }
}
