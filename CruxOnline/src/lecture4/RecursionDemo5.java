package lecture4;

import java.util.Scanner;

public class RecursionDemo5 {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("x= ");
        int x = scn.nextInt();

        System.out.print("n= ");
        int n = scn.nextInt();

        System.out.println(power(x, n));


    }

    public static int power(int x, int n) {

        if (n == 0) {
            return 1;
        }
        int pnm1 = power(x, n - 1);   // pnm1 = Power Of N-1
        int pn = x * pnm1;               // pn = Power Of N
        return pn;


    }
}