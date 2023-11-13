import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> G = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            G.add(sc.nextInt());
        }
        ArrayList<Integer> result = new ArrayList<>();

        for (int i : G) {
            int P = (i * 100) / N;
            if (0 <= P && P <= 4) {
                result.add(1);
            } else if (4 < P && P <= 11) {
                result.add(2);
            } else if (11 < P && P <= 23) {
                result.add(3);
            } else if (23 < P && P <= 40) {
                result.add(4);
            } else if (40 < P && P <= 60) {
                result.add(5);
            } else if (60 < P && P <= 77) {
                result.add(6);
            } else if (77 < P && P <= 89) {
                result.add(7);
            } else if (89 < P && P <= 96) {
                result.add(8);
            } else if (96 < P && P <= 100) {
                result.add(9);
            }
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
