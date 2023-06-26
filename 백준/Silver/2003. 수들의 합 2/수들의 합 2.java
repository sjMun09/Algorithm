import java.io.*;
import java.util.*;
class Main {
    public static void main(String args[]) throws IOException {
        // 2003 투 포인터로 문제푼거임.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.print(twoPointer(arr, m));
    }
    static int twoPointer(int[] arr, int m) {
        int count = 0;
        int startPoint = 0, endPoint = 0;
        int len = arr.length;
        int sum = 0;
        while(true) {
            if(sum >= m) {
                sum -= arr[startPoint++];
            }
            else if(endPoint >= len) {
                break;
            }
            else {
                sum += arr[endPoint++];
            }
            if(sum == m) {
                count++;
            }
        }
        return count;
    }
}