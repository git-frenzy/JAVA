package lecture3;

public class StringPerformance {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		appendString(100000);
		long end = System.currentTimeMillis();

		System.out.println(end - start);

	}
	@SuppressWarnings("unused")
	public static void appendString(int n) {
		String s = "";

		for (int i = 0; i <= n; i++) {

			s += i;

		}

	}

}
