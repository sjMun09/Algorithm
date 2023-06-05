import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class Main {
    static class Info implements Comparable<Info> {
        double val;
        int idx, cnt;

        public Info(double val, int idx, int cnt) {
            this.val = val;
            this.idx = idx;
            this.cnt = cnt;
        }

        @Override
        public int compareTo(Info i) {
            return i.val < this.val ? -1 : 1;
        }
    }

    static double sol(ArrayList<Double> v, int m) {
        int n = v.size();
        PriorityQueue<Info> PQ = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            PQ.offer(new Info(v.get(i), i, 1));
        }
        double mn = Collections.min(v);
        double ret = PQ.peek().val - mn;
        for (int i = 0; i < m; i++) {
            Info info = PQ.poll();
            double val = info.val;
            int idx = info.idx;
            int cnt = info.cnt;
            val = v.get(idx) / (double) (++cnt);
            PQ.offer(new Info(val, idx, cnt));
            mn = Math.min(mn, val);
            ret = Math.min(ret, PQ.peek().val - mn);
        }
        return ret;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Double> v = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            v.add(Double.parseDouble(st.nextToken()));
        }
        int m = Integer.parseInt(br.readLine());
        double result = sol(v, m);

        // 원하는 소수점 자리 범위로 반올림하여 출력합니다.
        DecimalFormat df = new DecimalFormat("#.################");
        System.out.println(df.format(result));
    }
}
