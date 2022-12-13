package lecture0;

import java.util.Scanner;

public class GCD2 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int divident = scn.nextInt();
		int divisor = scn.nextInt();

		while (divident % divisor != 0) {
			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;
		}
		System.out.println(divisor);
	}
}