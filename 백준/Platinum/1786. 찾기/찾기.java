import java.io.*;
import java.util.*;
import java.math.*;
public class Main {

    public static void main(String[] args) throws IOException {
        // 1786 찾기문제, 해당 문제, 해시로 안됨. 무조건 KMP 써야함ㅜㅜ
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String T = br.readLine();
        String P = br.readLine();

        ArrayList<Integer> matching = KMP(T, P);

        System.out.println(matching.size());
        for (int position : matching) {
            System.out.print(position + 1 + " ");
        }
    }

    //접두사와 접미사의 일치 여부를 확인
    private static int[] getPi(String pattern) {
        int m = pattern.length();
        int[] pi = new int[m];
        int j = 0;
        for (int i = 1; i < m; i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = pi[j - 1];
            }
            if (pattern.charAt(i) == pattern.charAt(j)) {
                pi[i] = ++j;
            }
        }
        return pi;
    }
    /*
    // 문자열 매칭 과정의 불필요한 검사 피하는 로직이라고 이해하면됨,
    (쉽게말해) --> ( kmp는 문자열 매칭을 효율적으로 수행하게 하는 알고리즘임. 배워두면 좋음 )
    패턴 문자열에서 각 문자를 접두사와 접미사로 분할,
    접두사와 접미사가 동일한 부분 문자열의 최대 길이를 계산.
    계산된 값들은 배열 pi 로 저장, 이를 통해 문자열 매칭 과정에서 불필요한 검사를 피하게 됩니다.
    얘, 패턴이 ABCDAB라면, getPI 클래스를 통하여, 찾는(계산) pi array == {0,0,0,0,1,2};가 됨.
    이 배열을 사용하여 KMP 알고리즘은 패턴 문자열이 불일치할 경우,
    이전에 일치한 접두사와 접미사의 길이만큼 건너뛰면서 돌아감.
     */

    private static ArrayList<Integer> KMP(String text, String pattern) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] pi = getPi(pattern);
        int n = text.length();
        int m = pattern.length();
        int j = 0;
        for (int i = 0; i < n; i++) {
            while (j > 0 && text.charAt(i) != pattern.charAt(j)) {
                j = pi[j - 1];
            }
            if (text.charAt(i) == pattern.charAt(j)) {
                if (j == m - 1) {
                    ans.add(i - m + 1);
                    j = pi[j];
                } else {
                    j++;
                }
            }
        }
        return ans;
    }
}
