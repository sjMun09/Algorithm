import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();
            if (s.equals("#")) break;

            s = s.toLowerCase(); // 대문자도 그냥 전부 소문자로 다 바꿔서 처리함
            int count=0;
            for(int i=0;i<s.length();i++) {
                char t=s.charAt(i);
                if(t=='a' || t=='e' || t=='i' || t=='o' || t=='u')
                    count++;
            }
            System.out.println(count);
        }

    }
}