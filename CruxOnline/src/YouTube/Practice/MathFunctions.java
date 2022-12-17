package YouTube.Practice;

public class MathFunctions {
    public static void main(String[] args) {
        double x= 3.14;
        double y = -10;

        double z = Math.max(x,y);   // returns the max value
        System.out.println(z);

        double r = Math.abs(y);     // returns the absolute value (removes the -ve)
        System.out.println(r);

        double s = Math.sqrt(r);    // returns the square root of a number
        System.out.println(s);

        double p = Math.round(x);   // returns the rounded off value of a number
        System.out.println(p);

        double C = Math.ceil(x);    // returns the ROUND UP value of a number  // IMPORTANT
        System.out.println(C);

        double F = Math.round(x);   // returns the ROUND DOWN value of a number  // IMPORTANT
        System.out.println(F);
    }

}
