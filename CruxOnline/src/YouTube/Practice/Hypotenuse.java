package YouTube.Practice;

import javax.swing.*;
import java.util.Scanner;

public class Hypotenuse {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter side X: ");
        double x = scn.nextDouble();

        System.out.println("Enter side Y: ");
        double y = scn.nextDouble();

        double z = Math.sqrt((x*x)+(y*y));
        System.out.println(z);

    }
}
