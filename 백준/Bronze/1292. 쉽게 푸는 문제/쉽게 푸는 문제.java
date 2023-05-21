import java.util.*;
import java.io.*;

public class Main{
public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] nums = new int[1000];

        int count = 0;
        int check = 1;

        for(int i = 0 ; i < 1000 ; i++) {
                nums[i] = check;
                count++;
                        if(check == count) {
                        check++;
                        count = 0;
                        }
        }
        int sum = 0;

        for(int i = M ; i <= N ; i++) {
        sum += nums[i-1];
        }
        System.out.print(sum);
        }
}
