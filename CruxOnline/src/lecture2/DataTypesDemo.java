package lecture2;

public class DataTypesDemo {

	public static void main(String[] args) {

		// Part 1
		byte b = 10;
//		short sh1 = 20;
		int in = 30;
		long ln = 40;

		// Part 2

		b = 10;
		b = 127;
		b = (byte) 128;
		System.out.println(b);

		// Part 3

		in = 1000000000;
//		in=10000000000;
		ln = 10000000000L;
		System.out.println(ln);

		// Part 4

//		sh1 = 32000;

		// Part 5

		float f = 5.5f;
		System.out.println(f);

		double db = 6.5;
		System.out.println(db);

		// Part 6

		in = (int) f;
		System.out.println(in);

		f = in;
		System.out.println(f);

		// Part 7

		boolean bit = true;
//		bit = 1;
//		bit = 0;

		if (bit) {
			System.out.println("Hello");

		}

		else {

			System.out.println("Bye");
		}

		////////////////////////////////////////////////////////////////

		bit = false;

		if (bit) {
			System.out.println("Hello");

		}

		else {

			System.out.println("Bye");
		}

		////////////////////////////////////////////////////////////////

		if (in > 0) {
			System.out.println("Greater");
		} else {
			System.out.println("Lesser or Equal");

		}

	}

}
