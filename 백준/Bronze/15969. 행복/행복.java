import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cnt = Integer.parseInt(br.readLine());
		String line = br.readLine();
		String[] split = line.split(" ");
		int[] students = new int[cnt];
		for (int i = 0; i < students.length; i++) {
			students[i] = Integer.parseInt(split[i]);
		}

		Arrays.sort(students);

		int min = students[0];
		int max = students[students.length - 1];

		bw.append(max - min + "");
		bw.flush();
	}
}