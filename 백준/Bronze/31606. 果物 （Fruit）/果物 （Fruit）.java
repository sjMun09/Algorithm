import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            int X = Integer.parseInt(reader.readLine());
            
            int Y = Integer.parseInt(reader.readLine());
            
            int bananas = 3;
            
            int totalFruits = X + Y + bananas;
            
            System.out.println(totalFruits);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
