import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long ab = Long.valueOf(st.nextToken() + st.nextToken());
        long cd = Long.valueOf(st.nextToken() + st.nextToken());
        System.out.println(ab + cd);
    }
}
