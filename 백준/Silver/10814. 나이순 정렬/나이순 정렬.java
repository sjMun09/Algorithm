import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[][] str = new String[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            str[i][0] = st.nextToken();
            str[i][1] = st.nextToken();
        }
        Arrays.sort(str, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (int i = 0; i < N; i++) {
            sb.append(str[i][0]).append(' ').append(str[i][1]).append('\n');
        }
        System.out.print(sb);
    }
}