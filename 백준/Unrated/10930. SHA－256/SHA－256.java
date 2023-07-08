import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(input.getBytes());
		
		StringBuilder sb = new StringBuilder();
		for(byte b: md.digest()) {
			sb.append(String.format("%02x", b));
		}
		System.out.println(sb.toString());
	}
}