import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lambda = Integer.parseInt(br.readLine());

        if(lambda >= 380 && lambda < 425) {
            System.out.println("Violet");
        }
        else if(lambda < 450) {
            System.out.println("Indigo");
        }
        else if(lambda < 495) {
            System.out.println("Blue");
        }
        else if(lambda < 570) {
            System.out.println("Green");
        }
        else if(lambda < 590) {
            System.out.println("Yellow");
        }
        else if(lambda < 620) {
            System.out.println("Orange");
        }
        else if(lambda <= 780) {
            System.out.println("Red");
        }
    }
}
/*
람다식으로 표현한다면 ?
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lambda = Integer.parseInt(br.readLine());

        Map<String, Integer[]> colorRangeMap = new HashMap<>();
        colorRangeMap.put("Red", new Integer[] {620, 780});
        colorRangeMap.put("Orange", new Integer[] {590, 620});
        colorRangeMap.put("Yellow", new Integer[] {570, 590});
        colorRangeMap.put("Green", new Integer[] {495, 570});
        colorRangeMap.put("Blue", new Integer[] {450, 495});
        colorRangeMap.put("Indigo", new Integer[] {425, 450});
        colorRangeMap.put("Violet", new Integer[] {380, 425});

        colorRangeMap.entrySet().stream()
            .filter(entry -> lambda >= entry.getValue()[0] && lambda < entry.getValue()[1])
            .forEach(entry -> System.out.println(entry.getKey()));
    }
}

*/