package lecture0;

import java.util.Scanner;

public class ElseIfDemo {
	
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Hello User");
		System.out.println("Enter your age \n");

		
		int a = scn.nextInt();
		
		if (a <= 11) {
			System.out.println("child");
		} 
		else if (a >= 12 && a <= 17) {
			System.out.println("teen");
		} 
		else if (a >= 18 && a <= 60) {
			System.out.println("adult");
		} 
		else {
			System.out.println("old");
		}
	}
}
