package test3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int weight = sc.nextInt();
		sc.close();
		int bmi = weight + 100 - height;
		System.out.println(bmi);
		if (bmi > 0) {
			System.out.println("Obesity");
		}

	}

}
