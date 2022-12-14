package lecture4;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_Recursion {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        System.out.println(Arrays.toString(arr));
        System.out.println(isSorted(arr, 0));
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

    public static boolean isSorted(int[] arr, int si) {
        if (si == arr.length - 1) {
            return true;
        }if (arr[si] > arr[si + 1]) {
            return false;
        } else {
            boolean restAns = isSorted(arr, si + 1);
            return restAns;
        }
    }
}