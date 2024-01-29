import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        // 세븐25의 삼각 김밥 가격 정보
        int X = Integer.parseInt(st.nextToken()); // 가격
        int Y = Integer.parseInt(st.nextToken()); // 그램
        
        // 1000그램 당 가격 계산
        double seven25PricePer1000g = (1000.0 / Y) * X;
        
        // 다른 편의점 개수
        int N = Integer.parseInt(br.readLine());
        
        // 최저가를 세븐25 가격으로 초기화
        double minPrice = seven25PricePer1000g;
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int Xi = Integer.parseInt(st.nextToken()); // 가격
            int Yi = Integer.parseInt(st.nextToken()); // 그램
            
            double pricePer1000g = (1000.0 / Yi) * Xi;
            
            // 최저가 업데이트
            if (pricePer1000g < minPrice) {
                minPrice = pricePer1000g;
            }
        }
        
        // 결과 출력 (소수점 둘째자리까지 표현)
        System.out.printf("%.2f\n", minPrice);
    }
}
