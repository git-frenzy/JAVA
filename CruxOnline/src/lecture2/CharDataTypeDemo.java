package lecture2;

public class CharDataTypeDemo {
	public static void main(String[] args) {

		char ch = 'a';
		ch = 99;

		System.out.println(ch);
//
//		ch = 64000;
//		System.out.println(ch);
		ch = (char) (ch + 2);
		System.out.println(ch);

	}

}
