import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Kim = Integer.parseInt(st.nextToken());
        int Im = Integer.parseInt(st.nextToken());
        int cnt = 0;

        while (Kim != Im) {
            Kim = Kim / 2 + Kim % 2;
            Im = Im / 2 + Im % 2;
            cnt++;
        }
        System.out.print(cnt);
    }
}