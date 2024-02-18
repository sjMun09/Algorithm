import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(br.readLine()); // 1년 전의 신장
        int B = Integer.parseInt(br.readLine()); // 현재 신장

        int growth = B - A; // 성장한 신장 

        System.out.println(growth); 
    }
}
