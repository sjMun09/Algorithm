import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /**
         * 새로운 사람이 입장할 때마다 '곰곰티콘' 사용. -> 곰곰티콘 사용된 횟수 구함.
         * ENTER -> 새로운 사람이 채팅방 입장했음을 나타냄. -> 그 외엔 채팅을 입력한 유저의 닉네임을 나타냄.
         * 닉네임은 영문 대소문자 또는 숫자로 구성.
         * 새로운 사람이 입장하게 된다면, 무조건 곰곰티콘 사용 후 아무 채팅이나 씀.
         * 즉, 곰곰티콘 = 최초 입장
         * 풀이 : Enter 는 새로운 사람이 입장함을 나타냄. Enter를 보면 채팅방에 있는 사람이 곰곰티콘을 사용함.
         * 즉, 입력1에 enter이후 채팅 기록은 전부 곰곰티콘임. 만약, 닉네임이 2번 반복된 것이 보인다면, 그것인 최초사용인 곰곰티콘 1회 + 일반 채팅
         * 입력 2, enter이후 채팅기록3개 => 곰곰티콘 + enter이후 채팅기록 2회 -> 곰곰티콘.
         * 즉, enter이 입력되면 곰곰티콘은 초기화 되는거임.
         * 시간 복잡도 : 1억 이내로 하면되고, O(N)
         */
        int N = Integer.parseInt(br.readLine());

        int count=0;

        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (input.equals("ENTER")) {
                set.clear();
            } else {
                if (!set.contains(input)) {
                    count++;
                    set.add(input);
                }
            }
        }
        System.out.print(count);
    }
}
