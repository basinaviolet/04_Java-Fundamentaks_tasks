package by.thp.homework.task4;

import java.util.Scanner;

public class Item7 {
	public static void main(String[] args) {
		// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

		int n;

		System.out.print("Enter lenth N: ");
		n = setInt();

		int[][] arrayNN = new int[n][n];

		int i, j;
		for (i = 0; i < arrayNN.length; i++) {
			for (j = 0; j < arrayNN[i].length; j++) {
				if (j < n - i) {
					arrayNN[i][j] = i + 1;
				} else {
					arrayNN[i][j] = 0;
				}
			}
		}

		System.out.print("The result array: ");
		getMultiArray(arrayNN);

	}

	public static int setInt() {

		Scanner newInt = new Scanner(System.in);

		while (!newInt.hasNextInt()) {
			System.out.print("\nEnter correct value: ");
			newInt.next();
		}

		return newInt.nextInt();
	}

	public static void getMultiArray(int[][] tempArray) {
		for (int i = 0; i < tempArray.length; i++) {
			System.out.print("\n");
			for (int j = 0; j < tempArray[i].length; j++) {
				System.out.print("[" + tempArray[i][j] + "] ");
			}
		}
		System.out.print("\n");
	}

}
