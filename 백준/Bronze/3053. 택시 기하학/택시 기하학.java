import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		double radius = Double.parseDouble(br.readLine()); // 반지름 R
	
		System.out.println(radius * radius * Math.PI);	// 유클리드 원의 넓이
		System.out.println(2 * radius * radius);		// 택시기하학 원의 넓이
		
	}
}