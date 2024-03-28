import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] A = new int[10];
        int[] B = new int[10];
        int AWin = 0, BWin = 0;
        
        String[] line = br.readLine().split(" ");
        for(int i = 0; i < 10; i++) {
            A[i] = Integer.parseInt(line[i]);
        }
        
        line = br.readLine().split(" ");
        for(int i = 0; i < 10; i++) {
            B[i] = Integer.parseInt(line[i]);
        }
        
        for(int i = 0; i < 10; i++) {
            if(A[i] > B[i]) AWin++;
            else if(A[i] < B[i]) BWin++;
        }
        
        if(AWin > BWin) System.out.println("A");
        else if(AWin < BWin) System.out.println("B");
        else System.out.println("D");
    }
}
