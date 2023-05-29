import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Set<Integer> setA = new HashSet<>();
        for (int i = 0; i < n; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        Set<Integer> setB = new HashSet<>();
        for (int i = 0; i < m; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        int symmetricDifferenceSize = symmetricDifference(setA, setB);
        System.out.println(symmetricDifferenceSize);
    }

    public static int symmetricDifference(Set<Integer> setA, Set<Integer> setB) {
        int count = 0;

        for (int element : setA) {
            if (!setB.contains(element)) {
                count++;
            }
        }

        for (int element : setB) {
            if (!setA.contains(element)) {
                count++;
            }
        }

        return count;
    }
}