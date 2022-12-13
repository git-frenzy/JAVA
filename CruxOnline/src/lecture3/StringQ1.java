package lecture3;

import java.util.Scanner;

public class StringQ1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Input: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }

    }
}