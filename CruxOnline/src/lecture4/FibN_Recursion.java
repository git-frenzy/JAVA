package lecture4;

import java.util.Scanner;

public class FibN_Recursion {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("input: ");
        int n = sc.nextInt();
        int a = 0, b = 1;

        System.out.println(a);
        System.out.println(b);
        fib(a, b, n - 2);
    }

    public static void fib(int a, int b, int n) {

        if(n==0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        fib(b, c, n - 1);
    }

}
