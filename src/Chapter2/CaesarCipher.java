package Chapter2;

import java.util.Scanner;

public class CaesarCipher {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		String s = sc.next();
		int mov = sc.nextInt()%26;
		String output = "";
		int pos = 0;
		for (char c : s.toCharArray()) {

			if ((c >= 97 && c <= 122)) {
				pos = c + mov;
				if (pos > 122) {
					pos = c + mov - 26;
				}
				output = output.concat(Character.toString((char) (pos)));

			} else if (c >= 65 && c <= 90) {
				pos = c + mov;
				if (pos > 90) {
					pos = c + mov - 26;
				}
				output = output.concat(Character.toString((char) (pos)));

			} else {
				output = output.concat(Character.toString((char) c));
			}
		}
		System.out.println(output);
	}
}
