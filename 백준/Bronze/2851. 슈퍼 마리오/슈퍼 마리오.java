import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 슈퍼 마리오가 먹을 수 있는 버섯의 수(10개)
        int[] mushrooms = new int[10];
        for (int i = 0; i < 10; i++) {
            mushrooms[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0; // 점수를 저장하는 변수
        int minDiff = Integer.MAX_VALUE; // 100에 가장 가까운 점수와의 차이를 저장하는 변수

        for (int i = 0; i < 10; i++) {
            sum += mushrooms[i]; // 버섯의 점수를 누적
            int diff = Math.abs(sum - 100); // 100과 차이 계산

            // 100에 더 가까운 점수를 찾으면 결과 업데이트
            if (diff <= minDiff) {
                minDiff = diff;
            } else {
                sum -= mushrooms[i]; // 현재 버섯 점수를 제외하고 종료
                break;
            }
        }

        System.out.println(sum);
    }
}