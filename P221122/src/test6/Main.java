package test6;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				System.out.print(str.charAt(i));
			} else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				System.out.print((char) (str.charAt(i) - 32));
			}
		}
	}
}
