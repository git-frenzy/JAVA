package YouTube.Practice;

public class StringMethods {
    public static void main(String[] args) {

        String name = "     bro     ";
        boolean result = name.equalsIgnoreCase("Bro");
        System.out.println(result);

        int result2 = name.length();
        System.out.println(result2);

        char result3 = name.charAt(0);
        System.out.println(result3);

        int result4 = name.indexOf("b");
        System.out.println(result4);

        boolean result5 = name.isEmpty();
        System.out.println(result5);

        String result6 = name.toUpperCase();
        System.out.println(result6);

        String result7 = name.toLowerCase();
        System.out.println(result7);

        String result8 = name.trim();
        System.out.println(result8);

        String result9 = name.replace('o', 'a');
        System.out.println(result9);
    }
}
