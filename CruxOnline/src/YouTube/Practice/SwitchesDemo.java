package YouTube.Practice;

public class SwitchesDemo {
    public static void main(String[] args) {

        String day = "tuesday";

        switch (day) {
            case "sunday":
                System.out.println("sunday");
                break;
            case "saturday":
                System.out.println("saturday");
                break;
            case "friday":
                System.out.println("friday");
                break;
            default:
                System.out.println(false);
                break;
        }
    }
}