package by.thp.homework.task4;

import java.util.Random;
import java.util.Scanner;

public class Item12 {
	public static void main(String[] args) {
		// Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
		// причем в каждом столбце число единиц равно номеру столбца..

		int m, n;

		System.out.print("Enter m: ");
		m = setIntPer();
		
		do {
			System.out.print("Enter n < or = m: ");
			n = setIntPer();
		} while (n > m);

		int[][] arrayNN = new int[m][n];

		Random tempPer = new Random();
		int count;
		for (int i = 0; i < n; i++) {
			count = 0;
			for (int j = 0; j < m; j++) {
				if (count == i +1) {
					arrayNN[j][i] = 0;
				} else if (count < (i + 1) && (m - j) <= (i + 1)){
					arrayNN[j][i] = 1;
					count += 1;
				} else {
					arrayNN[j][i] = tempPer.nextInt(2);
					count += arrayNN[j][i];
				}
			}
		}

		System.out.print("The result array:\n");
		getMultiArray(arrayNN);
	}

	public static int setIntPer() {

		Scanner tempPer = new Scanner(System.in);
		while (!tempPer.hasNextInt()) {
			System.out.print("Enter correct value: ");
			tempPer.next();
		}
		return tempPer.nextInt();
	}

	public static void getMultiArray(int[][] tempArray) {
		
		int i, j;
		for (i = 0; i < tempArray[0].length; i++) {
			System.out.print(" " + (i + 1) + ": ");
		}
		for (i = 0; i < tempArray.length; i++) {
			System.out.print("\n");
			for (j = 0; j < tempArray[i].length; j++) {
				System.out.print("[" + tempArray[i][j] + "] ");
			}
		}
		System.out.print("\n");
	}
}
