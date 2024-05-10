import java.io.*;
import java.util.*;

/*
 * 자바 대소문자 변환 https://pridiot.tistory.com/24
 * https://velog.io/@yeoul8/JAVA-%EB%8C%80%EC%86%8C%EB%AC%B8%EC%9E%90-%EB%B0%94%EA%BF%94%EC%84%9C-%EC%B6%9C%EB%A0%A5%ED%95%98%EA%B8%B0
 */
public class Solution {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String T = br.readLine();
		String answer = "";
		char c;
		
		for(int i=0;i<T.length();i++) {
			c = T.charAt(i);  // charAt() : 문자열에서 문자 하나만 가져오는 함수
			if(Character.isUpperCase(c)) { // 대문자인지 확인
				//answer += Character.toLowerCase(c); // 소문자로 변환
                answer+=c;        
			}else answer+=Character.toUpperCase(c); // 대문자로 변환
			
		}
		System.out.print(answer);
		
	}
}
