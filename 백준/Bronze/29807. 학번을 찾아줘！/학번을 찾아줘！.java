import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        int[] score = new int[5];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<T; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }

        long result = 0;
        if(score[0] > score[2]) {
            result += (score[0]-score[2]) * 508;
        } else {
            result += (score[2]-score[0]) * 108;
        }
        
        if(score[1] > score[3]) {
            result += (score[1]-score[3]) * 212;
        } else {
            result += (score[3]-score[1]) * 305;
        }

        if(T == 5) {
            result += score[4] * 707;
        }
        
        result *= 4763;
        System.out.print(result);
    }
}
