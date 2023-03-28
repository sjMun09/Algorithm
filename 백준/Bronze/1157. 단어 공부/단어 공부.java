import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1번 풀이
        int[] arr = new int[26];
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            // 현재 i번쨰 문자가 소문자 알파벳인지 판단하는 조건
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                // 만약 소문자라면 'a'의 아스키 코드값 97을 빼줌
                arr[str.charAt(i) - 97]++;
            } else{
                // 대문자일경우, 'A' 의 아스키 코드 값
                arr[str.charAt(i)-65]++;
            }
        }
        int max = -1;
        // char ch =0; 으로 작성해도 무방.
        char ch = '?';
        // 앞에서 계산한 각 알파벳의 arr 배열(출현빈도)를 바탕으로, 가장 빈도가 높은 알파벳을 출력.
        for (int i = 0; i < 26; i++) {
            // 가장 높은 빈도 값을 저장하고, ch 변수에는 해당 알파벳을 저장함/
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            } else if (arr[i]==max) {
                ch = '?';
            }
        }
        System.out.print(ch);
    }
}

