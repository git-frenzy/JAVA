package lecture2;

import java.util.Scanner;

public class UpperOrLowerCase {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {

		
		
		char ch = scn.next().charAt(0);

		
		{
			if (ch >= 'a' && ch <= 'z') {
				System.out.println("Lower Case");

			} else if (ch >= 'A' && ch <= 'Z') {
				System.out.println("Upper Case");

			}

			else {
				System.out.println("Invalid Character");
			}

		}
	}

}
