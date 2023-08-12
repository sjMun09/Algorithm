import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        if(a == b)
            System.out.println("1");
        else
            System.out.println("0");
    }
}