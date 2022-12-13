package lecture3;

public class StringBuilderFunctions {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();

		sb.append("Hello");

// insert	
		sb.insert(sb.length(), 'g');
		System.out.println(sb);

// delete
		sb.deleteCharAt(3);
		System.out.println(sb);

// update 
		sb.setCharAt(4, 'd');
		System.out.println(sb);

		sb.setCharAt(sb.length() - 1, 'k');
		System.out.println(sb);

// String Builder to String

		String str = sb.toString();
		System.out.println(str);
		
		
// String to String Builder
		
		String s1 = "hello";
		StringBuilder sb1 = new StringBuilder(s1);
		System.out.println(sb1);
		
	}

}
