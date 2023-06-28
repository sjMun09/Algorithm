import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int len = num.length();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = num.charAt(i) - '0';
        }

        //선택정렬
        for (int i = 0; i < len - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[maxIdx] < arr[j]) {
                    maxIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }

        for (int i : arr) {
            System.out.print(i);
        }
    }
}