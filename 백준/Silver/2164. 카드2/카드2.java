import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> myQueue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            myQueue.add(i);
        }
        while (myQueue.size() > 1) {
            myQueue.poll();
            myQueue.add(myQueue.poll());
        }
        System.out.print(myQueue.poll());
    }
}