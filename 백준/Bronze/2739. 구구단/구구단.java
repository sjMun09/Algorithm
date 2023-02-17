import java.util.Scanner;

public class Main {
    
    public static void main(String[]args){
      
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if(N<10){
            for(int j=1; j<10;j++){
                System.out.println(N+" * "+j+" = "+(N*j));
            }
       } in.close();
    }
}