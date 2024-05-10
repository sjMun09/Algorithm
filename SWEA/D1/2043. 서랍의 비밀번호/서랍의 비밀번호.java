import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
pw : 009, k : 980일 경우 해결한 원형 계산 적용.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int pw = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int attempts;
        if (pw >= k) {
            attempts = pw - k + 1;
        } else {
            attempts = 1000 - k + pw + 1;
        }

        System.out.print(attempts);
    }
}
