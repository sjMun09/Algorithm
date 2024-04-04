import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str1 = br.readLine();
        String str2 = br.readLine();
        
        int[] count = new int[26]; // 알파벳 빈도수
        for (char c : str1.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : str2.toCharArray()) {
            count[c - 'a']--;
        }
        
        int result = 0;
        for (int i : count) {
            result += Math.abs(i); // 빈도수 차이의 절대값을 결과에 더함
        }
        
        System.out.println(result);
    }
}
