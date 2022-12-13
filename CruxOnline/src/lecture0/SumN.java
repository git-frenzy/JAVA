
package lecture0;

import java.util.Scanner;

public class SumN {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scn.nextInt();
		int counter = 1;
		int sum = 0;

		while (counter <= n) {
			sum = sum + counter;
			counter = counter + 1;

		}

		System.out.println(sum);
	}
}