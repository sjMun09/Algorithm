import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 글자가 같은 선수 5명 선발. 만약 없으면 기권. PREDAJA
        // 알파벳 26개 EJOTY 라서 배열크기는 26
        int[] arr = new int[26];
        int N = Integer.parseInt(br.readLine());
        // 선별 가능한지 유무 판단하려고함
        boolean ok = false;
        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            char c = name.charAt(0);
            // a의 아스키코드는 97라서, 배열에 저장할 때 arr[첫글자 -97]을 이용해서 저장할 수 있습니다.
            arr[c - 97]++;
            // 만약 5명이 된다면 5명을 선발하기
            if (arr[c - 97] == 5) {
                ok = true;
            }
        }
        // 만약 선발 가능이라면
        if (ok) {
            // 알파벳 26개
            for (int i = 0; i < 26; i++) {
                if (arr[i] >= 5) {
                    // a 아스키코드 97
                    System.out.print((char) (i + 97));
                }
            }
        } else {
            System.out.print("PREDAJA");
        }
    }
}

