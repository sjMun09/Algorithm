import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // A(1년 고정료) = 임대료 + 재산세 + 보험료 + 급여
        // B(1대 노트북 생산비용) = 재료비 + 인건비
        // 손익 분기점 구하기
        // 출력 값은 최초 이익 발생 판매량 존재하지 않을경우 -1
        // C = 노트북 가격
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
//      (C - B) = 1대당 나의 순수익으로 생각해서 로직을 짜게되면 어렵다 정말 어렵다.
//      따라서, n=개당개수 일때, 총비용과 총수입이 같아지는 식,  n*C = A + (B*n)
//      따라서 순익분기점이 발생하는 판매량의 개수 식은 n= A/C-B +1 입니다.
//      여기서 왜 1을 더해주냐면 부등식이 같을 경우에는 순익 분기점이 발생하는 시점이 아니고,
//      0원 즉 이익이 없는 손해도 없는 그런 상태를 말합니다. 그래서 +1을 더해주면 순익이 발생합니다.

        if (C-B<=0) {
            System.out.print("-1");
        }else System.out.print(A/(C-B)+1);

    }
}

