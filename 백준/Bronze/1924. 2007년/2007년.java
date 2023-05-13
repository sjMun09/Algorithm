import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int date = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        String[] week = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int n = 0;
        for (int i = 0; i < date; i++) {
            n += months[i];
        }
        n += day-1;
        System.out.print(week[n%7]);
    }
}