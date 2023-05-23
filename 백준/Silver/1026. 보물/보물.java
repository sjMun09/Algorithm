import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int arrayLength = Integer.parseInt(br.readLine());
        int[] arrayA = new int[arrayLength];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arrayLength; i++) {
            arrayA[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrayA); // 오름차순 소팅

        Integer[] arrayB = new Integer[arrayLength];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arrayLength; i++) {
            arrayB[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrayB, Comparator.reverseOrder()); // 내림차순 소팅 

        int result = 0;
        for (int i = 0; i < arrayLength; i++) {
            result += arrayA[i] * arrayB[i];
        }

        wr.write(result + "\n");
        wr.flush();
        wr.close();
        br.close();
    }

}
