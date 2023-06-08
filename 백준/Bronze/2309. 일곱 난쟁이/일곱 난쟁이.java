// 선택한 난쟁이들 수를 7이, 합이 100인 조합을 찾을거에요.
import java.util.*;
import java.io.*;

class Main{

    static int N = 9; // 9명
    static int[] height = new int[9]; // 9명 input 그대로 초기화
    static int a = 0;
    static boolean[] selected = new boolean[N]; // 초이스할 때, boolean을 사용


    public static void main(String[]args) throws IOException{
        BufferedReader br  =new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<N;i++ ){
            height[i]= Integer.parseInt(br.readLine());
        }
        find(0,0,0);

    }
    // count = 난쟁이 수, sum = 합계 100, satrt= 카운팅해줄거
    static void find(int count, int sum, int start){
        if(count == 7 && sum == 100){
            print();
            return;

        }
        /*
        재귀 방식인데,
         */
        if(count <7){
            for(int i=start;i<N;i++){  //  ~ 9
                if(!selected[i]) selected[i]= true;
                    find(count+1, sum+height[i], i+1);
                    selected[i] = false;
            }
        }
    }

    static void print(){
        a++;

        int[] dwarf = new int[7]; // 7명이어야 하니까
        int index= 0;
        for(int i=0;i<N;i++){
            if(selected[i]) dwarf[index++] = height [i]; // 인덱스 민다고 생각/
        }
        Arrays.sort(dwarf); // sort
        for(int j=0;j<7;j++)
            if(a==1)
            System.out.print(dwarf[j]+"\n");

    }

}