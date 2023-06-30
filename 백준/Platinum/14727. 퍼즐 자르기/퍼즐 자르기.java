import java.io.*;
import java.util.*;

class Main {
    public static long max(long a, long b) {
        return (a > b) ? a : b;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] p = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            p[i] = Integer.parseInt(br.readLine());
        }

        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(0, 0));

        long ans = 0;
        for (int i = 1; i < n + 1; i++) {
            while (stack.peek().fst > p[i]) {
                long h = stack.peek().fst;
                long r = i - 1;
                stack.pop();
                long l = stack.peek().snd;
                ans = max(ans, (r - l) * h);
            }
            stack.push(new Pair(p[i], i));
        }

        while (stack.size() != 1) {
            long r = n;
            long h = stack.peek().fst;
            stack.pop();
            long l = stack.peek().snd;
            ans = max(ans, (r - l) * h);
        }

        System.out.print(ans);
    }

    static class Pair {
        long fst;
        int snd;

        public Pair(long fst, int snd) {
            this.fst = fst;
            this.snd = snd;
        }
    }
}
