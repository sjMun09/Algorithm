import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        int g = Integer.parseInt(input[0]); // 그룹의 수
        int p = Integer.parseInt(input[1]); // 그룹당 사람 수
        int t = Integer.parseInt(input[2]); // 양성 반응을 보인 그룹의 수

        int individualTests = g * p;
        int groupTests = g + (t * p);

        if (individualTests < groupTests) {
            System.out.println(1);
        } else if (groupTests < individualTests) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }
}
