import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		boolean [] arr = new boolean[101];
		
		int count = 0;
		
		for(int i =0; i < num; i++) {
			int temp = sc.nextInt();
			
			if(arr[temp] == true) {
				count++;
			}
			
			else {
				arr[temp] = true;
			}
		}
		
		System.out.println(count);
	}
	}