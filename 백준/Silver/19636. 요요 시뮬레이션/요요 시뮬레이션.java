import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w, basic, t, day, d_input, d_output;

        // 입력
        w = scanner.nextInt();
        basic = scanner.nextInt();
        t = scanner.nextInt();
        day = scanner.nextInt();
        d_input = scanner.nextInt();
        d_output = scanner.nextInt();

        int w1 = w;
        int w2 = w;

        // 일일 기초대사량
        int basic2 = basic;

        for (int i = 0; i < day; i++) {
            w1 += d_input - (basic + d_output);
            w2 += d_input - (basic2 + d_output);
            // 기초대사량 변화 : w2에만 반영됨, 체중 변화 다음에 발생
            if (Math.abs(d_input - (basic2 + d_output)) > t)
                basic2 += Math.floorDiv(d_input - (basic2 + d_output), 2);
        }

        // 출력 01. 일일 기초대사량의 변화 반영 X
        if (w1 <= 0)
            System.out.println("Danger Diet");
        else
            System.out.println(w1 + " " + basic);

        // 출력 02. 일일 기초대사량의 변화 반영 O
        if (w2 <= 0 || basic2 <= 0)
            System.out.println("Danger Diet");
        else {
            System.out.print(w2 + " " + basic2 + " ");
            if (basic - basic2 > 0) // 체중이 아니라 일일 기초대사량으로 비교해야 함
                System.out.println("YOYO");
            else
                System.out.println("NO");
        }
    }
}
