import java.io.*;
import java.util.*;

/*
 * 자바는 문자열의 문자 접근을 charAt을 이용해서 한다는 것이 해당 문제의 키 포인트라고 생각한다.
 * 명시적 형변환 한 다음, 64를 빼서 ('A' 는 65이다) 1부터 나오도록 구현한다.
 * 문자를 숫자로 변환하는 방법은 앞에 (int)를 붙여주고 숫자를 문자로 바꿔줄 때는 (char)을 붙여준다.
 * '0' 은 48이다. 이를 간과해서 'A'+'0'는 숫자가 된다고 생각했는데 113이 되어서 당황했었다. (65+48===113이 된 것)
 * 'A'-0 으로 해주면 그제서야 제대로 숫자로 형변환된다.
 * 즉, (int)s.charAt(i)로 해줘도 되지만 s.charAt(i)-0 이렇게 해줘도 된다. 
 * 알파벳을 숫자로, 
 */
public class Solution {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String T = br.readLine();
		for(int i=0; i<T.length();i++) {
			System.out.print(((int)T.charAt(i)-64)+ " ");
		}
		
	}
}
/*
솔 2)
 String input = br.readLine();

        // 결과를 저장할 StringBuilder
        StringBuilder result = new StringBuilder();

        // 입력받은 문자열의 각 문자를 숫자로 변환
        for (char ch : input.toCharArray()) {
            if (result.length() > 0)
                result.append(" ");  // 첫 번째 문자가 아니면 공백 추가

            if (ch >= 'a' && ch <= 'z') {  // 소문자인 경우
                result.append((int) ch - 'a' + 1);
            } else if (ch >= 'A' && ch <= 'Z') {  // 대문자인 경우
                result.append((int) ch - 'A' + 1);
            }
        }

        // 결과 출력
        System.out.println(result.toString());
*/