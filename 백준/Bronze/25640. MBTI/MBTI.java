import java.io.*;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String jinhoMBTI = br.readLine(); 
        int friendCount = Integer.parseInt(br.readLine()); 

        int sameMBTIcount = (int) IntStream.range(0, friendCount) 
            .mapToObj(i -> {
                try {
                    return br.readLine(); // 각 친구의 mbti 유형 입력
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            })
            .filter(mbti -> mbti.equals(jinhoMBTI)) // 필터링
            .count(); // 필터링된 같은 mbti 수를 카운트

        System.out.print(sameMBTIcount);
    }
}