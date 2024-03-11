import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> seminarRooms = new HashMap<>();
        
        seminarRooms.put("Algorithm", "204");
        seminarRooms.put("DataAnalysis", "207");
        seminarRooms.put("ArtificialIntelligence", "302");
        seminarRooms.put("CyberSecurity", "B101");
        seminarRooms.put("Network", "303");
        seminarRooms.put("Startup", "501");
        seminarRooms.put("TestStrategy", "105");

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String seminarName = br.readLine(); 
            System.out.println(seminarRooms.get(seminarName)); 
        }
    }
}
