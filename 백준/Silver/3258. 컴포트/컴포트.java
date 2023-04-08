import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static int N, Z, M;

    public static void main(String[] args) throws IOException {
        String[] line1 = input.readLine().split(" ");  // 첫 번째 줄을 입력 받아서 공백을 기준으로 분리하여 배열에 저장합니다.
        // 첫 번째 줄에서 입력받은 값을 변수에 저장합니다.
        N = Integer.parseInt(line1[0]);     
        Z = Integer.parseInt(line1[1]);     
        M = Integer.parseInt(line1[2]);     

        boolean[] obstacle = new boolean[N + 1];    // 장애물을 표시하기 위한 boolean 배열을 선언합니다. 배열의 크기는 N+1로 설정합니다.
        String[] line2 = input.readLine().split(" ");    // 두 번째 줄을 입력 받아서 공백을 기준으로 분리하여 배열에 저장합니다.
        for (int i = 0; i < M; i++) {   // M개의 장애물 위치를 입력받아서 배열에 표시합니다.
            int position = Integer.parseInt(line2[i]);   // 배열에서 장애물 위치를 가져옵니다.
            obstacle[position] = true;  // 해당 위치에 장애물이 있다는 것을 표시합니다.
        }

        System.out.println(solve(obstacle));    // solve 메소드를 호출하여 결과를 출력합니다.
    }

    private static int solve(boolean[] obstacle) {    // solve 메소드를 선언합니다. 장애물 배열을 인자로 받습니다.

        for (int i = 1; i < 1000; i++) {    // 1부터 999까지의 값을 i에 대입하여 반복합니다.

            int cur = 1;    // 현재 위치를 나타내는 cur 변수를 초기화합니다.
            boolean[] isVisited = new boolean[N + 1];    // i만큼 이동할 때마다 방문한 위치를 표시하기 위한 배열을 선언합니다. 배열의 크기는 N+1로 설정합니다.

            while (cur < 1000) {    // 현재 위치가 1000보다 작을 때까지 반복합니다.
                if (cur == Z) {    // 현재 위치가 Z와 같으면 i 값을 반환합니다.
                    return i;
                }
                if (!isVisited[cur]) {    // 현재 위치를 방문한 적이 없다면 방문했음을 표시합니다.
                    isVisited[cur] = true;
                } else {    // 이미 방문한 적이 있는 경우
                    break;  // 현재 i 값에서 더 이상 방문할 수 있는 위치가 없으므로 반복문을 중단합니다.
                }
                cur += i;   // i만큼 이동합니다.
                if (cur > N) {  // 현재 위치가 N을 넘어갈 경우에는 1부터 시작합니다.
                    cur -= N;
                }
                if (obstacle[cur]) {    // 장애물이 있는 위치에 도달하면 i 값에서 더 이상 방문할 수 있는 위치가 없으므로 반복문을 중단합니다.
                    break;
                }
            }
        }
        return -1;  // Z에 도달할 수 없는 경우 -1을 반환합니다.
    }
}