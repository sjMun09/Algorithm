import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

class meetingRoom implements Comparable<meetingRoom> {
    private int startTime;
    private int endTime;

    public meetingRoom(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public int compareTo(meetingRoom meetingRoom) {
        if (this.endTime == meetingRoom.endTime) {
            return this.startTime - meetingRoom.startTime;
        }
        return this.endTime - meetingRoom.endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        meetingRoom[] meetingRooms = new meetingRoom[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int startTime = Integer.parseInt(st.nextToken());
            int endTime = Integer.parseInt(st.nextToken());

            meetingRooms[i] = new meetingRoom(startTime, endTime);
        }

        Arrays.sort(meetingRooms);

        int count = 0;
        int end = 0;

        for (int i = 0; i < n; i++) {
            if (end <= meetingRooms[i].getStartTime()) {
                end = meetingRooms[i].getEndTime();
                count++;
            }
        }

        System.out.print(count);
    }
}
