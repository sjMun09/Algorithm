import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int R = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());

        int totalCupcakes = (R * 8) + (S * 3);
        int students = 28;
        
        int leftOver = totalCupcakes >= students ? totalCupcakes - students : 0;

        System.out.println(leftOver);
    }
}
