import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int gr = Integer.parseInt(st.nextToken());
        int gc = Integer.parseInt(st.nextToken());

        int pr = Integer.parseInt(st.nextToken());
        int pc = Integer.parseInt(st.nextToken());

        char[][] map = new char[r][c];

        for (int i = 0; i < r; i++) {
            map[i] = br.readLine().toCharArray();
        }

        int n = pr * pc;

        int count = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(map[i][j] == 'P'){
                    count++;
                }
            }
        }
        if(count == n){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
}