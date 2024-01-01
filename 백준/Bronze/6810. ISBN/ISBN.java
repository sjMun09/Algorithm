import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = new String[3];
        for(int i=0; i<3; i++){
            input[i] = reader.readLine();
        }

        List<Integer> isbnFixedPart = Arrays.asList(9, 7, 8, 0, 9, 2, 1, 4, 1, 8);
        List<String> isbnVariablePart = Arrays.asList(input);
        
        int sum = 0;

        for(int i=0; i<10; i++){
            if(i % 2 == 0) sum += isbnFixedPart.get(i);
            else sum += isbnFixedPart.get(i) * 3;
        }

        for(int j=0; j<3; j++){
            if((j+10) % 2 == 0) sum += Integer.parseInt(isbnVariablePart.get(j));
            else sum += Integer.parseInt(isbnVariablePart.get(j)) * 3;
        }

        System.out.println("The 1-3-sum is " + sum);
    }
}
