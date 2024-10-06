import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // input
        int N = Integer.parseInt(br.readLine());
        //Queue 알고리즘
        Queue<Integer> queue = new LinkedList<>();

        // add
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        // solV
        while (queue.size() > 1) {
            queue.poll();
            queue.add(queue.poll());
        }
        System.out.println(queue.poll());

    }
}