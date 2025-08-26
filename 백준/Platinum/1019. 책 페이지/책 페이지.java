import java.util.*;

public class Main {
    static long[] count = new long[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        solve(N);

        for (int i = 0; i < 10; i++) {
            System.out.print(count[i] + " ");
        }
    }

    static void solve(long n) {
        long start = 1;
        long end = n;
        long digit = 1; 

        while (start <= end) {
            while (end % 10 != 9 && start <= end) {
                addCount(end, digit);
                end--;
            }
            while (start % 10 != 0 && start <= end) {
                addCount(start, digit);
                start++;
            }

            if (start > end) break;

            start /= 10;
            end /= 10;

            for (int i = 0; i < 10; i++) {
                count[i] += (end - start + 1) * digit;
            }

            digit *= 10; 
        }
    }

    static void addCount(long x, long digit) {
        while (x > 0) {
            int d = (int)(x % 10);
            count[d] += digit;
            x /= 10;
        }
    }
}
