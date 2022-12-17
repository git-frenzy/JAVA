package lecture5;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        int n = 2;
        int[] array = new int[n];

        int arr[] = takeInput();
        System.out.println(Arrays.toString(arr));

    }

    public static int[] takeInput() {
        System.out.println("size of array ?");
        int s1 = scn.nextInt();

        int arr[] = new int[s1];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("value for " + i + " index");
            arr[i] = scn.nextInt();
        }

        return arr;

    }
}
