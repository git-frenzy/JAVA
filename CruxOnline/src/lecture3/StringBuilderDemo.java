package lecture3;

public class StringBuilderDemo {
	public static void main(String[] args) {
		
		
		StringBuilder sb = new StringBuilder();
		

		System.out.println(sb.length());
		
//appending
		sb.append("abc");
		System.out.println(sb);
		sb.insert(3, "def");
		System.out.println(sb);		
		
		
	}

}
