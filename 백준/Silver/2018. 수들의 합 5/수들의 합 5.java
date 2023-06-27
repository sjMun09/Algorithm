import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        // Two Pointers
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int start =1, end=1, sum=0, count=0;
        while (start <= N) {
            if (sum < N) {
                sum += end;
                end++;
            } else {
                sum -= start;
                start++;
            }
            if (sum == N) {
                count++;
            }
        }
        System.out.print(count);
    }
}