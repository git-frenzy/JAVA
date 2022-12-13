package lecture3;

import java.util.Scanner;

public class _2D_ArrayDemo {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("enter rows");
		int rows = scn.nextInt();

		System.out.println("enter columns");
		int cols = scn.nextInt();

		int[][] numbers = new int[rows][cols];

// INPUT

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {
				numbers[i][j] = scn.nextInt();

			}

		}

// OUTPUT

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}

}
