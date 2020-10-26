package by.thp.homework.task4;

import java.util.Random;
import java.util.Scanner;

public class Item2 {
	public static void main(String[] args) {
		// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
		int n, m;
		int k, p;

		System.out.print("Enter lenth N: ");
		n = setInt();

		System.out.print("Enter width M: ");
		m = setInt();

		Random randomInt = new Random();
		k = randomInt.nextInt(m);
		if (k == 0) {k = + 1; } // исключение 0-й строки \ колонки
		p = randomInt.nextInt(n);
		if (p == 0) {p = + 1; }

		int[][] arrayMN = new int[m][n];
		arrayMN = setMultiArray(m, n);

		int[] row = new int[n];
		int[] collumn = new int[m];

		System.out.print("The original array: ");
		getMultiArray(arrayMN);
		
		for (int i = 0; i < arrayMN[k-1].length; i++) {
			row[i] = arrayMN[k-1][i];
		}

		for (int i = 0; i < arrayMN.length; i++) {
			collumn[i] = arrayMN[i][p-1];
		}

		System.out.print("\nk: " + k + ", p: " + p);
		System.out.print("\nRow: ");
		getArray(row);
		System.out.print("\nCollumn:");
		getArray(collumn);

	}

	public static int setInt() {

		Scanner newInt = new Scanner(System.in);

		while (!newInt.hasNextInt()) {
			System.out.print("\nEnter correct value: ");
			newInt.next();
		}

		return newInt.nextInt();
	}

	public static int[][] setMultiArray(int n, int k) {

		Random randomPer = new Random();
		int[][] tempArray = new int[n][k];

		for (int i = 0; i < tempArray.length; i++) {
			for (int j = 0; j < tempArray[i].length; j++) {
				tempArray[i][j] = randomPer.nextInt(100);
			}
		}
		return tempArray;
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

	public static void getArray(int[] tempArray) {

		for (int i = 0; i < tempArray.length; i++) {
			System.out.print("[" + tempArray[i] + "] ");
		}

	}
}
