import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> shapeLines = new ArrayList<>();

        shapeLines.add("  ___  ___  ___");
        shapeLines.add("  | |__| |__| |");
        shapeLines.add("  |           |");
        shapeLines.add("   \\_________/");
        shapeLines.add("    \\_______/");
        shapeLines.add("     |     |");
        shapeLines.add("     |     |");
        shapeLines.add("     |     |");
        shapeLines.add("     |     |");
        shapeLines.add("     |_____|");
        shapeLines.add("  __/       \\__");
        shapeLines.add(" /             \\");
        shapeLines.add("/_______________\\");

        for (String line : shapeLines) {
            System.out.println(line);
        }
    }
}
