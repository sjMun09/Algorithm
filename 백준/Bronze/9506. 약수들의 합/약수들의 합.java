import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) throws IOException {
        // 완전수 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }
            int divisorSum = getDivisorSum(n);
            if (divisorSum == n) {
                String answer = getDivisors(n).stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(" + "));
                                                //.map 부분은, Java 8의 Stream API를 사용하여 
                                              //Integer 객체의 스트림을 String 객체의 스트림으로 변환할 때 쓰이는거임
                                              // 즉,  스트림의 각 Integer 값을 해당하는 String 값으로 변환하고,
                                               // 이를 사용하여 새로운 String 스트림을 생성하는데 사용
                System.out.println(n + " = " + answer);
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }

    static List<Integer> getDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    static int getDivisorSum(int n) {
        int sum = 0;
        for(int i = 1; i < n; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
