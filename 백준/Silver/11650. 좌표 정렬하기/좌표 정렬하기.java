import java.io.*;
import java.util.*;
class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][]points = new int[N][2];
        for(int i=0; i<N;i++){
            st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }
       // Arrays.sort(points, Comparator
       //                .comparingInt((int[] point) -> point[0])
       //                .thenComparingInt(point -> point[1]));
        Arrays.sort(points,new Comparator<int[]>(){
            public int compare(int[]point1, int[]point2){
                if(point1[0]==point2[0]){
                    return Integer.compare(point1[1], point2[1]);
                }return Integer.compare(point1[0], point2[0]);
            }
        });
        
        
        for(int i=0;i<N;i++){
            System.out.println(points[i][0]+" "+points[i][1]);
        }
    }
}