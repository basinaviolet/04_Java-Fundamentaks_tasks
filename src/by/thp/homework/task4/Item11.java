package by.thp.homework.task4;

import java.util.Random;

public class Item11 {
	public static void main(String[] args) {
		// Матрицу 10x20 заполнить случайными числами от 0 до 15.
		// Вывести на экран саму матрицу и номера строк, в которых число 5 встречается
		// три и более раз.

		int n = 10;
		int m = 20;
		int[][] arrayNN = new int[n][m];
		arrayNN = setMultiArray(n, m);

		System.out.print("The original array: ");
		getMultiArray(arrayNN);

		int[] tempRes = new int[n];
		int k = 0;
		int count = 0;

		for (int i = 0; i < arrayNN.length; i++) {
			count = 0;
			for (int j = 0; j < arrayNN[i].length; j++) {
				if (arrayNN[i][j] == 5) {
					count++;
				}
			}
			if (count >= 3) {
				tempRes[k] = i + 1;
				k++;
			}
		}

		if (k > 0) {
			int[] result = new int[k];
			for (int i = 0; i < k; i++) {
				result[i] = tempRes[i];
			}
			System.out.print("\nThe result array: \n");
			getArray(result);
		} else {
			System.out.print("\nThe result array is empty");
		}

	}

	public static int[][] setMultiArray(int n, int m) {

		Random randomPer = new Random();
		int[][] tempArray = new int[n][m];
		for (int i = 0; i < tempArray.length; i++) {
			for (int j = 0; j < tempArray[i].length; j++) {
				tempArray[i][j] = randomPer.nextInt(15);
			}
		}
		return tempArray;
	}

	public static void getMultiArray(int[][] tempArray) {
		for (int i = 0; i < tempArray.length; i++) {
			System.out.print("\n" + (i + 1) + ": ");
			for (int j = 0; j < tempArray[i].length; j++) {
				System.out.print("[" + tempArray[i][j] + "] ");
			}
		}
		System.out.print("\n");
	}

	public static void getArray(int[] tempArray) {
		for (int i = 0; i < tempArray.length; i++) {
			System.out.print("[" + tempArray[i] + "] ");
		}
		System.out.print("\n");
	}

}
