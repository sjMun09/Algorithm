import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T, n, x1, y1, x2, y2, cx, cy, r,cnt;
        T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st= new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            cnt =0;
            n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                st= new StringTokenizer(br.readLine());
                cx = Integer.parseInt(st.nextToken());
                cy = Integer.parseInt(st.nextToken());
                r = Integer.parseInt(st.nextToken());
                if(Math.pow(x1-cx,2)+ Math.pow(y1-cy,2)<Math.pow(r,2)&&Math.pow(x2-cx,2)+Math.pow(y2-cy,2)<Math.pow(r,2)) continue;
                else if (Math.pow(x1-cx,2)+ Math.pow(y1-cy,2)<Math.pow(r,2)||Math.pow(x2-cx,2)+Math.pow(y2-cy,2)< Math.pow(r,2)) cnt++;
            }
            System.out.println(cnt);
        }
    }
}