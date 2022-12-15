package lecture4;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort_Recursion {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        System.out.println(Arrays.toString(arr));
        int si = 0, li = arr.length - 1;
        bubbleSort(arr, si, li);
    }

    public static int[] takeInput() {
        System.out.print("number of index ");
        int s = scn.nextInt();
        int[] arr = new int[s];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("value for " + i + " index- ");
            arr[i] = scn.nextShort();
        }
        return arr;
    }

    public static void bubbleSort(int[] arr, int si, int li) {

        if (li == 0) {
            return;
        }

        if (si == li) {
            bubbleSort(arr, 0, li - 1);
            return;
        }

        if (arr[si] > arr[si + 1]) {
            int temp = arr[si];
            arr[si] = arr[si + 1];
            arr[si + 1] = temp;
        }
        bubbleSort(arr, si + 1, li);

        System.out.println(Arrays.toString(arr));
    }
}