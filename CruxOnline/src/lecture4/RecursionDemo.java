package lecture4;

import java.util.Scanner;

public class RecursionDemo {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("input: ");
        int n1 = scn.nextInt();
        PD(n1);
    }

    public static void PD(int n) {

        if (n == 0) {
            return;
        }
        System.out.println(n);
        PD(n - 1);


    }
}