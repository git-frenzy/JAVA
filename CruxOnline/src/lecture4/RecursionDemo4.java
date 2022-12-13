package lecture4;

public class RecursionDemo4 {

    public static void main(String[] args) {
        System.out.println(FT(5));
    }

    public static int FT(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * FT(n - 1);
    }
}