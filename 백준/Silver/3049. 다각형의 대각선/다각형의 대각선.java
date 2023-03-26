import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 교차점이 일치하지 않는 다각형의 꼭지점 개수는
        // 다각형의 대각선 + 외각선의 갯수와 동일합니다.
        // 다각형에서 대각선이 존재하려면 꼭지점은 최소 4개 이어야만합니다.
        // nC4 = n! / 4!(n-4)! 이 됩니다.
        // if n=4 일경우, 몫 1로 예외 -> 이경우 풀어서씀.
        
        int N = Integer.parseInt(br.readLine());

        System.out.println((N * (N-1) * (N-2) * (N-3)) / 24);
    }
}

