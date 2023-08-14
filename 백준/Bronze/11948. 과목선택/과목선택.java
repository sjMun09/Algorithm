import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] li = new int[6];
        int sum = 0;
        
        for(int i=0; i<6; i++){
            li[i] = sc.nextInt();
        }
        
        Arrays.sort(li, 0, 4);
        Arrays.sort(li, 4, 6);
        
        for(int i=1; i<4; i++){
        sum += li[i];
        }
        sum += Math.max(li[4], li[5]);
        
        System.out.println(sum);
    }
}