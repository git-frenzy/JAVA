package YouTube.Practice;

public class Arrays {
    public static void main(String[] args) {


        String[][] cars = {
                {"camaro", "Corvette", "Silverado"},
                {"mustang", "Ranger", "F-150"},
                {"ferrari", "lambo", "tesla"}
        };

        for(int i =0; i<cars.length;i++){
            System.out.println();
            for(int j=0; j<cars[i].length; j++){
                System.out.println(cars[i][j]+" ");
            }
        }
    }
}