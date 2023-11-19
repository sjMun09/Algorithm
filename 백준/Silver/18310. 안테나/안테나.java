import java.io.*;
import java.util.*;
// 집들 중에서 1개의 집을 지정. 그 집을 기준으로 각 거리의 합이 최소가 되어야한다.
// 집들의 포인트에서 큰수 - 작은수 하면 값이 나온다 또는 그냥 math.abs 를 쓰자.
// 굳이 ? 이거 그냥 수학적으로 정렬떄리고 중앙값 구하면 되는거 아닌가 ?
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int house = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] housePoint = new int[house];
        for (int i = 0; i<house; i++) {
            housePoint[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(housePoint);
        int mid = housePoint[(house-1)/2];
        System.out.print(mid);
    }
}