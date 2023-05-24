import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//  문자열로 받고 문자열로 받은 것을 문자로 하나씩 인식해서 그 인식 번호가 w는 9번 -> 스위치문 써서 더해줌

        String s = br.readLine();

        int count =0;
        int t = s.length();

        for (int i = 0; i < t; i++) {
            switch (s.charAt(i)) {
                case 'A' : case 'B': case 'C' :
                    count += 3;
                    break;

                case 'D' : case 'E': case 'F' :
                    count += 4;
                    break;

                case 'G' : case 'H': case 'I' :
                    count += 5;
                    break;

                case 'J' : case 'K': case 'L' :
                    count += 6;
                    break;

                case 'M' : case 'N': case 'O' :
                    count += 7;
                    break;

                case 'P' : case 'Q': case 'R' : case 'S' :
                    count += 8;
                    break;

                case 'T' : case 'U': case 'V' :
                    count += 9;
                    break;

                case 'W' : case 'X': case 'Y' : case 'Z' :
                    count += 10;
                    break;
            }
        }
        System.out.println(count);

    }
}

