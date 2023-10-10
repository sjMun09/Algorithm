import java.util.*;
import java.io.*;
public class Main{
    public static boolean ground[][];
    public static int ROWS;
    public static int COLS;
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        ROWS = Integer.parseInt(st.nextToken());
        COLS = Integer.parseInt(st.nextToken());
        
        ground= new boolean[ROWS][COLS];
        for(int i=0;i<ROWS;i++) {
            String temp = br.readLine();
            
            for(int j=0;j<COLS;j++) {
                if(temp.charAt(j)=='#') {
                    ground[i][j] = true;
                }
            }
        }
        int answer = 0;
        for(int i=0;i<ROWS;i++) {
             for(int j=0;j<COLS;j++) { 
                 if(ground[i][j]) {
                     answer++;
                     
                     burnGrass(i,j);
                 }
             }
        }
        
        sb.append(answer);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }
    public static void burnGrass(int row, int col) {
        if(row<0 || row==ROWS || col<0 || col==COLS) {
            return;
        }
        if(!ground[row][col]) {
            return;
        }
        
        ground[row][col] = false;
        
        burnGrass(row-1,col);
        burnGrass(row+1,col);
        burnGrass(row,col-1);
        burnGrass(row,col+1);
        
    }

    
}