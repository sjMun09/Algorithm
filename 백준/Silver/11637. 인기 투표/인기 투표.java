import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine()); // Test
        
        for(int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine()); // candidate
            int[] votes = new int[N]; // vote
            int totalVotes =0;
            int maxVotes =0;
            
            for(int j=0;j<N;j++){
                int vote =  Integer.parseInt(br.readLine());
                votes[j]= vote;
                totalVotes += vote;
                // sort
                if(votes[maxVotes]<votes[j]) maxVotes = j;
            }
            int winnerCandidate =0;
            for(int j=0;j<N;j++){
                if(votes[j]==votes[maxVotes]) winnerCandidate ++;
            }
            if(winnerCandidate>1) bw.write("no winner\n");
            else if(votes[maxVotes]>totalVotes/2) bw.write("majority winner "+(maxVotes+1)+"\n");
            else bw.write("minority winner "+(maxVotes+1)+"\n");
            
        }
        bw.flush();
        bw.close();
        br.close();
    }
}