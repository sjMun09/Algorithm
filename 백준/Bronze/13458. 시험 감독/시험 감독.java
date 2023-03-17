import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 줄바꿈을 해줘야 하기 때문에, 일단 정의만 해둠. 초기화는 나중에 할 예정 (줄 바꿀때)
        StringTokenizer st;

        // 감독 초기화
        long supervisor = 0;
        // 각 시험장 배열로 표현,
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
//          배열 인덱스 번호 = 시험장의 넘버.
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

//      시험장 갯수만큼 감독수도 늘려줘야함 -> 각각의 시험장에 총감독관 1명만 필수요소 == 시험장 갯수
        supervisor += N;

        for (int i = 0; i < N; i++) {
            // 총 감독관이 감독할 수 있는 시험장만큼 시험장을 빼줌 시험장 (시험장 == arr[])배열
            arr[i] -= B;
            //부 감독관 넣기.
            if (arr[i]<=0) continue;
            supervisor += arr[i] / C;
            // 딱 맞지 않을 경우 1명 더 추가
            if (arr[i] % C != 0) {
                supervisor++;
            }
        }
        System.out.print(supervisor);
    }
}

