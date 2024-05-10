import java.io.*;
import java.util.*;


public class Solution {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String str,year, month,day;
		/*
		 * 몇 가지 중요한 문제가 있다.
		 * 각 월에 따라 유효한 일수를 확인하는 로직이 필요하다.
		 * 나는 이것을 반복문을 통해 charAt()로 확인하려 했으나 더 복잡하게 구현이 될 것 같았다.
		 * 따라서 완전히 연, 월, 일을 추출해서 validation을 해야한다.
		 */
		int[] daysOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		/*
		 * 문자열 자르기, https://jamesdreaming.tistory.com/81
		 * https://hianna.tistory.com/534
		 * https://seasome1.com/%EC%9E%90%EB%B0%94-substring/
		 */
		for(int i=1; i<=T;i++) {
			str = br.readLine();
			year = str.substring(0,4);
			month = str.substring(4,6);
			day = str.substring(6,8);
			
			int monthDay = Integer.parseInt(month);
			int daysDay = Integer.parseInt(day);
			
			//validation
			if(monthDay <1 || monthDay>12) System.out.print("#"+i+" -1"+"\n");
			else {
				// 해당 월의 일수 validation
				if(daysDay>=1 && daysDay<= daysOfMonth[monthDay]) {
					System.out.print("#"+i+" "+year+"/"+month+"/"+day+"\n");
				}else {
					System.out.print("#"+i+" -1"+"\n");
				}
			}
		}

	}
}