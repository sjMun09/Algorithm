import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        br.close();
        System.out.print(calcSkills(N,str));
    }
    private static int calcSkills(int N, String skills) {
        Stack<Character> LRStack = new Stack<>();
        Stack<Character> SKStack = new Stack<>();
        int skillsCount = 0;

        for (int i = 0; i < N; i++) {
            char c = skills.charAt(i);
            if (c == 'L') {
                SKStack.push(c);
            } else if (c == 'S') {
                LRStack.push(c);
            } else if (c == 'K') {
                if (!LRStack.isEmpty()) {
                    skillsCount++;
                    LRStack.pop();
                } else {
                    break;
                }
            } else if (c == 'R') {
                if (!SKStack.isEmpty()) {
                    skillsCount++;
                    SKStack.pop();
                } else {
                    break;
                }
            }else skillsCount++;
        }
        return skillsCount;
    }
}