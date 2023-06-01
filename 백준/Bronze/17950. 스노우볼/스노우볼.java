import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int H = Integer.parseInt(input[0]); // 과제산의 높이
        int x = Integer.parseInt(input[1]); // 스노우볼이 커지는 정도
        int moc = 1000000007; // 10^9 + 7

        // 스노우볼의 개수 배열
        int[] snowballHeight = new int[H + 1];

        // 입력받은 높이에서의 스노우볼 개수 저장
        for (int i = 1; i <= H; i++) {
            snowballHeight[i] = Integer.parseInt(br.readLine());
        }

        long total = 0;
        long calculate = 1;

        // 과제산에서 내려오는 스노우볼들의 크기 합 계산
        for (int i = 0; i <= H; i++) {
            total = (total + calculate * snowballHeight[i]) % moc;
            calculate = (calculate * x) % moc;
        }

        System.out.println(total);
    }
}
