import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        double []arr =new double [N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        double max=0;
        double sum=0;
        // 배열의 길이만큼 반복
        for (int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
            max = Math.max(arr[i], max);
            sum += arr[i];
        }
        System.out.print((double)(((sum/max)*100)/N));
    }
}

