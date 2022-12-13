package lecture0;

import java.util.Scanner;

public class EvenOdd {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter your number to check");

		int n = scn.nextInt();

		System.out.print("Your number is ");

		if (n % 2 == 0) {

			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}
}
