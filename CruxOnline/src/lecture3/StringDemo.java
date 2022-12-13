package lecture3;

import java.util.Scanner;

public class StringDemo {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "Kanishk";
		String str3 = "Suri";

// CONCATINATION (adding different strings together)

		String fullName = str2 + str3;

		String str4 = str1 + " " + fullName;

		System.out.println(str4);

// length of a string
		System.out.println("full name length= " + fullName.length());

// COMPARISON OF STRINGS

		String s1 = "tony";
		String s2 = "tony";

		// 1 s1 > s2 : +ve value
		// 2 s1 == s2 : 0
		// 3 s1 < s2 : -ve value

// method 1 (PROPER & SUGGESTED)
		if (s1.compareTo(s2) == 0) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

// method 2 (NON SUGGESTED)
		if (s1 == s2) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}


// character index
		
		System.out.println(s1.charAt(0));
		
		
// index of
		
		System.out.println(s1.indexOf("o"));

// starts with
		System.out.println(s1.startsWith("To")); // is case-sensitive so false 
		System.out.println(s1.startsWith("to"));
	
	}

}
