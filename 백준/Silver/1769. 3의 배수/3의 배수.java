import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, cnt = 1, sum = 0, last = -1;
        while((a = br.read() - '0') >= 0 ) {
            sum += a;
            last = a;
        }
        if(sum==last) {
            System.out.println(0);
            System.out.println(sum%3==0 ? "YES" : "NO");
            return;
        }

        while(sum/10 != 0) {
            cnt++;
            sum = sumMethod(sum);
        }
        System.out.println(cnt);
        System.out.print(sum%3==0 ? "YES" : "NO");
    }
    private static int sumMethod(int val) {
        int result = val%10, tmp, quot = val/10;
        while(quot != 0) {
            tmp = quot%10;
            result += tmp;
            quot /= 10;
        }
        return result;
    }
}