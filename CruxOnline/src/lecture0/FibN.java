package lecture0;

import java.util.Scanner;

public class FibN {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scn.nextInt();
		int a = 0;
		int b = 1;
		int i = 1;

		while (i <= n + 1) {
			System.out.println(a);
			int sum = a + b;
			a = b;
			b = sum;
 			i++;

		}

	}

}


