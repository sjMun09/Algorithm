import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String[] sliceInfo = br.readLine().split(" ");
            String[] wholeInfo = br.readLine().split(" ");

            int sliceArea = Integer.parseInt(sliceInfo[0]);
            int slicePrice = Integer.parseInt(sliceInfo[1]);

            int wholeRadius = Integer.parseInt(wholeInfo[0]);
            int wholePrice = Integer.parseInt(wholeInfo[1]);
            double wholeArea = Math.PI * wholeRadius * wholeRadius;

            double sliceValue = (double)sliceArea / slicePrice;
            double wholeValue = wholeArea / wholePrice;

            if(sliceValue > wholeValue) {
                System.out.println("Slice of pizza");
            } else {
                System.out.println("Whole pizza");
            }
        }
    }
}
