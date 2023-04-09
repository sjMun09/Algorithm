import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    static String[] s = new String[3];
    static boolean[] chAl = new boolean[26];  // 사용한 알파벳 체크
    static boolean[] chNum = new boolean[10]; // 0-9 숫자 사용 체크

    static List<Character> alList = new ArrayList<>(); // 사용한 알파벳 담은 리스트
    static int[] alNum = new int[26]; // 알파벳에 해당하는 숫자

    static boolean flag = false;
    static String answer = "NO";

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        for (int i = 0; i < s.length; i++) {
            s[i] = st.nextToken();
        }

        // 사용한 알파벳 체크 & 추가
        str = str.replaceAll(" ", "");
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - 'A';
            if (!chAl[num]) {
                chAl[num] = true;
                alList.add(str.charAt(i));
            }
        }

        if (alList.size() <= 10) {
            DFS(0);
        }

        bw.write(answer);
        bw.flush();
        bw.close();
        br.close();
    }


    public static void DFS(int L) {
        if (flag) return;
        if (L == alList.size()) {
            long num1 = calcNum(s[0]), num2 = calcNum(s[1]), num3 = calcNum(s[2]);
            if (num1 + num2 == num3) {
                flag = true;
                answer = "YES";
            }
            return;
        }

        for (int i = 0; i <= 9; i++) {
            if (!chNum[i]) {
                alNum[alList.get(L) - 'A'] = i;

                chNum[i] = true;
                DFS(L + 1);
                chNum[i] = false;
            }
        }
    }

      public static long calcNum(String s) {
        long num = 0;
        for (int i = 0; i < s.length(); i++) {
            num = num * 10 + alNum[s.charAt(i) - 'A'];
        }
        return num;
    }
}