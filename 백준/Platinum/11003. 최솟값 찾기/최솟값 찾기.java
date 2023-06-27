import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());

        ArrayDeque<Integer> myDeque = new ArrayDeque<Integer>(); 
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            if(!myDeque.isEmpty() && myDeque.getFirst() <= i - l) {
                myDeque.removeFirst();
            }
            while(!myDeque.isEmpty() && arr[myDeque.getLast()] > arr[i]) {
                myDeque.removeLast();
            }
            myDeque.offer(i);	
            sb.append(arr[myDeque.getFirst()]).append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}