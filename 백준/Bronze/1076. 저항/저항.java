import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str));

        int color1 = list.indexOf(br.readLine()) * 10;
        int color2 = list.indexOf(br.readLine());
        int color3 = list.indexOf(br.readLine());

        System.out.println((long)((color1 + color2)*Math.pow(10, color3)));
    }
}

