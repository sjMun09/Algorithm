import java.io.*;

class Main{
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int B = Integer.parseInt(br.readLine());
        int sum = B/11*10;
        System.out.print(sum);
    }
}