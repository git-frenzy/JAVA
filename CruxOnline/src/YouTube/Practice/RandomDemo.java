package YouTube.Practice;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {

        Random r = new Random();

        int x = r.nextInt();
        System.out.println(x);

        int X = r.nextInt(6);        // limit random numbers by adding an index (starts from 0)
        System.out.println(X);

        double y = r.nextDouble();
        System.out.println(y);

        boolean z = r.nextBoolean();
        System.out.println(z);

    }
}
