import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=-1;
        }
        String s = br.readLine(); // 문자열 스트림으로 받음

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (arr[ch - 'a'] == -1) { // 원소길이 -1일 경우만 초기화
                arr[ch - 'a'] = i;
            }
        }
        for (int var : arr) { // 배열 출력
            System.out.print(var + " ");
        }
    }
}
