import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 1080;  // 북쪽

        for (int i = 0; i < 10; i++) {
            int direction = scanner.nextInt();

            if (direction == 1) {
                x += 90;
            } else if (direction == 2) {
                x += 180;
            } else if (direction == 3) {
                x -= 90;
            }
        }

        x /= 90;
        x %= 4;

        if (x == 0) {
            System.out.println('N');
        } else if (x == 1) {
            System.out.println('E');
        } else if (x == 2) {
            System.out.println('S');
        } else {
            System.out.println('W');
        }

        scanner.close();
    }
}