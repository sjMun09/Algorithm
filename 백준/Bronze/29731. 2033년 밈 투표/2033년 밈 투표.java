import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashSet<String> promises = new HashSet<>();
        promises.add("Never gonna give you up");
        promises.add("Never gonna let you down");
        promises.add("Never gonna run around and desert you");
        promises.add("Never gonna make you cry");
        promises.add("Never gonna say goodbye");
        promises.add("Never gonna tell a lie and hurt you");
        promises.add("Never gonna stop");
        
        int N = Integer.parseInt(br.readLine()); // 입력 받을 공약의 수
        boolean isChanged = false; // 공약이 변경되었는지 확인하는 플래그
        
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (!promises.contains(input)) { // 입력된 공약이 HashSet에 없다면 변경된 것입니다.
                isChanged = true;
                break;
            }
        }
        
        if (isChanged) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
