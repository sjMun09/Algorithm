import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String clubFirstLetter = br.readLine();
        String clubName = "";

        switch (clubFirstLetter) {
            case "M":
                clubName = "MatKor";
                break;
            case "W":
                clubName = "WiCys";
                break;
            case "C":
                clubName = "CyKor";
                break;
            case "A":
                clubName = "AlKor";
                break;
            case "$":
                clubName = "$clear";
                break;
        }

        System.out.println(clubName);
    }
}