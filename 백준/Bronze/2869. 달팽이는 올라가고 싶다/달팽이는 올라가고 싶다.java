import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());

        // length / (up - down) 으로 생각했으나, 이렇게 하면 틀린 풀이
        int day = (length - down) / (up - down);
        // 나머지가 있을 경우 (잔여 생각)
        if ((length - down) % (up - down) != 0)
            day++;

        System.out.print(day);
    }
}

