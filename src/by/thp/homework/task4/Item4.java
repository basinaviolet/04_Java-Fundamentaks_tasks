package by.thp.homework.task4;

import java.util.Scanner;

public class Item4 {
	public static void main(String[] args) {
		// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

		int n;

		System.out.print("Enter lenth N: ");
		n = setInt();

		int[][] arrayNN = new int[n][n];

		int i, j, k;
		for (i = 0; i < arrayNN.length; i++) {
			if (i % 2 == 0) {
				for (j = 0; j < arrayNN[i].length; j++) {
					arrayNN[i][j] = j + 1;
				}
			} else {
				k = 0;
				for (j = arrayNN[i].length; j > 0; j--) {
					arrayNN[i][k] = j;
					k++;
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
