import java.io.*;
import java.util.Arrays;

public class Main {

    static int N = 9;
    static int [] height = new int[N];

    // 일곱 난쟁이를 선택하는 데 사용할 예정
    static boolean[] selected = new boolean[N];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 일곱 난쟁이의 키의 합이 100
        for (int i = 0; i < N; i++) {
            height[i] = Integer.parseInt(br.readLine());
        }
        findSevenDwarf(0, 0, 0);
    }


    // cnt 는 선택된 난쟁이의 수,  는 선택할 수 있는 난쟁이 중에서 현재 선택한 난쟁이의 다음 난쟁이를 가리킴
    static void findSevenDwarf(int cnt, int sum, int start) {
        // 7명이고 키 합이 100일때
        if (cnt == 7 && sum == 100) {
            printSevenDwarf();
            System.exit(0); // 강제종료
        }
        if (cnt < 7) {
            for (int i = start; i < N; i++) {
                if (!selected[i]) {
                    selected[i] = true;
                    findSevenDwarf(cnt + 1, sum + height[i], i+1);
                    selected[i] = false;
                }
            }
        }

    }

    static void printSevenDwarf(){
        // dwarf == 난쟁이
        int[] dwarf = new int[7];
        int index =0;
        for (int i = 0; i < N; i++) {
            if (selected[i]){
                dwarf[index++] = height[i];
            }
        }
        Arrays.sort(dwarf);
        for (int i = 0; i < dwarf.length; i++) {
            System.out.println(dwarf[i]);
        }
    }
}