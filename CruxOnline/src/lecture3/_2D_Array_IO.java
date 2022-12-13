package lecture3;

import java.util.Scanner;

public class _2D_Array_IO {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] arr = takeInput();
		display(arr);

	}

	public static int[][] takeInput() {

		System.out.print("rows - ");
		int row = scn.nextInt();

		System.out.print("columns - ");
		int col = scn.nextInt();

		int arr[][] = new int[row][col];

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {

				System.out.print(i + "," + j + " - ");
				arr[i][j] = scn.nextInt();

			}
		}

		System.out.println(); // extra spacing

		return arr;

	}

	public static void display(int[][] arr) {

		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");

			}
			System.out.println();
		}
	}

}
