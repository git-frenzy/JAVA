package lecture4;

public class RecursionDemo3 {

    public static void main(String[] args) {
        PI(5);
    }

    public static void PI(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        PI(n - 1);
        System.out.println(n);


    }
}