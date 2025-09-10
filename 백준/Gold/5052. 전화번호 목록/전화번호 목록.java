import java.io.*;
import java.util.*;

public class Main {

    static class Trie {
        int[][] next;
        boolean[] end;    
        int nodeCount;    

        Trie(int maxNodes) {
            next = new int[maxNodes][10];
            for (int i = 0; i < maxNodes; i++) Arrays.fill(next[i], -1);
            end = new boolean[maxNodes];
            nodeCount = 1;
        }

        boolean insertAndCheck(String s) {
            int cur = 0;
            for (int i = 0; i < s.length(); i++) {
                if (end[cur]) {
                    return false;
                }
                int d = s.charAt(i) - '0';
                if (next[cur][d] == -1) {
                    next[cur][d] = nodeCount;
                    Arrays.fill(next[nodeCount], -1);
                    nodeCount++;
                }
                cur = next[cur][d];
            }
            for (int j = 0; j < 10; j++) {
                if (next[cur][j] != -1) return false;
            }
            end[cur] = true;
            return true;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] nums = new String[n];
            int totalLen = 1;
            for (int i = 0; i < n; i++) {
                nums[i] = br.readLine().trim();
                totalLen += nums[i].length();
            }

            Trie trie = new Trie(totalLen + 5);
            boolean consistent = true;

            for (int i = 0; i < n && consistent; i++) {
                if (!trie.insertAndCheck(nums[i])) {
                    consistent = false;
                }
            }
            out.append(consistent ? "YES" : "NO").append('\n');
        }
        System.out.print(out.toString());
    }
}