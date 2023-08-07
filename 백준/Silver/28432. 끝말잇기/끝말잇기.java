import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] endWords = new String[n];
        for (int i = 0; i < n; i++) {
            endWords[i] = br.readLine();
        }
        int m = Integer.parseInt(br.readLine());
        String[] candidates = new String[m];
        for (int i = 0; i < m; i++) {
            candidates[i] = br.readLine();
        }
        String answer = "";
        for (String candidate : candidates) {
            boolean isValidCandidate = true;
            Set<String> usedWords = new HashSet<>();
            for (int index = 0; index < n; index++) {
                String currentWord;
                if (endWords[index].equals("?")) {
                    currentWord = candidate;
                } else {
                    currentWord = endWords[index];
                }
                if (usedWords.contains(currentWord)) {
                    isValidCandidate = false;
                    break;
                }
                usedWords.add(currentWord);
                if (index == n - 1) {
                    break;
                }
                if (endWords[index + 1].equals("?")) {
                    if (!currentWord.endsWith(candidate.substring(0, 1))) {
                        isValidCandidate = false;
                        break;
                    }
                } else if (!currentWord.endsWith(Character.toString(endWords[index + 1].charAt(0)))) {
                    isValidCandidate = false;
                    break;
                }
            }
            if (isValidCandidate) {
                answer = candidate;
                break;
            }
        }
        System.out.print(answer);
    }
}
