package lecture4;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

	   	int[] array = takeInput();
		display(array);
		selectionSort(array);

	}

	public static int[] takeInput() {

		System.out.println("size of array ?");
		int s1 = scn.nextInt();

		int arr[] = new int[s1]; // Input will allocate the size of array

		for (int i = 0; i < arr.length; i++) {
			System.out.println("value for " + i + " index");
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i += 10) {
			System.out.println();
			System.out.println("Array = " + Arrays.toString(arr));
		}
	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		display(arr);
	}
}