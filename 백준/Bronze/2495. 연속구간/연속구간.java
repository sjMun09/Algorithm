import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<3; i++) 
		{
			String str = sc.next();

			int result = 1;
			char ch = str.charAt(0);
			int temp_result = 1;
			for(int j = 1; j < str.length(); j++) 
			{
				// 이전 문자열과 같은 문자열
				if(str.charAt(j) == ch ) 
				{
					temp_result++;
				}
				// 다른 문자열인 경우
				else 
				{ 
					ch = str.charAt(j);
					temp_result = 1;
				}

				if(temp_result >= result) 
				{
					result = temp_result;
				}
			}
			System.out.println(result);

		}
	}
}