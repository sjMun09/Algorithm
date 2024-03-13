import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Max의 시청 정보 입력 받기
        String[] input1 = br.readLine().split(" ");
        int t1 = Integer.parseInt(input1[0]);
        int e1 = Integer.parseInt(input1[1]);
        int f1 = Integer.parseInt(input1[2]);
        
        // Mel의 시청 정보 입력 받기
        String[] input2 = br.readLine().split(" ");
        int t2 = Integer.parseInt(input2[0]);
        int e2 = Integer.parseInt(input2[1]);
        int f2 = Integer.parseInt(input2[2]);
        
        int totalTime1 = t1 * 3 + e1 * 20 + f1 * 120; // Max의 시청 시간
        int totalTime2 = t2 * 3 + e2 * 20 + f2 * 120; // Mel의 시청 시간
        
        if (totalTime1 > totalTime2) {
            System.out.println("Max");
        } else if (totalTime1 < totalTime2) {
            System.out.println("Mel");
        } else {
            System.out.println("Draw");
        }
    }
}
