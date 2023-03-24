import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] check = new boolean[10001];	// 1부터 10000이므로

        for (int i = 1; i < 10001; i++){
            int n = getNotSelfNum(i);

            if(n < 10001){	// 10000 이 넘는 수는 필요가 없음
                check[n] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int j = 1; j < 10001; j++) {
            if (!check[j]) {	// false 인 인덱스만 출력
                sb.append(j).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int getNotSelfNum(int n){
        int sum = n;

        while(n != 0){
            sum = sum + (n % 10); // 첫 째 자리수
            n = n/10;	// 10을 나누어 첫 째 자리를 없앤다
        }

        return sum;
    }
}

