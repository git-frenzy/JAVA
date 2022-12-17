package YouTube.Practice;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {

        //      logical operators = used to connect two or more expressions
        //
        //      && = (AND) both conditions must be true
        //      || = (OR) either condition must be true
        //      ! = (NOT) reverses boolean value of condition

        Scanner scn = new Scanner(System.in);

        System.out.println("you're playing a game! Press q or Q ro quit");
        String response = scn.next();

        if (response.equals('q') || response.equals('Q')){ //IMPORTANT
            System.out.println("You quit the game");
        }
        else
            System.out.println("you're still playing the game");

        // (==) sign is used for primitive data types (ex- int, char, etc)
        // (.equals) is used for REFERENCE data types (ex- String, etc)


    }
}
