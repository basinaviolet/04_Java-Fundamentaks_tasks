package by.thp.homework.task4;

import java.util.Random;
import java.util.Scanner;

public class Item10 {
	public static void main(String[] args) {
		// Найти положительные элементы главной диагонали квадратной матрицы

		int n;

		System.out.print("Enter lenth N: ");
		n = setInt();

		int[][] arrayNN = new int[n][n];
		arrayNN = setMultiArray(n);
		
		System.out.print("The original array: ");
		getMultiArray(arrayNN);
		
		int[] temRes = new int[n];
		int k = 0;

		for (int i = 0; i < arrayNN.length; i++) {
			for (int j = 0; j < arrayNN[i].length; j++) {
				if (j == i) {
					if (arrayNN[i][j] > 0) {
						temRes [k] = arrayNN[i][j];
						k++;
					}
				} 
			}
		}
		
		int[] result = new int[k];
		for (int i = 0; i < k; i++) {
			result[i] = temRes[i];
		}

		System.out.print("\nThe result array: \n");
		getArray(result);

	}

	public static int setInt() {

		Scanner newInt = new Scanner(System.in);

		while (!newInt.hasNextInt()) {
			System.out.print("\nEnter correct value: ");
			newInt.next();
		}

		return newInt.nextInt();
	}
	
	public static int[][] setMultiArray(int n) {

		Random randomPer = new Random();
		int[][] tempArray = new int[n][n];
		int k = 1;
		for (int i = 0; i < tempArray.length; i++) {
			for (int j = 0; j < tempArray[i].length; j++) {
				tempArray[i][j] = randomPer.nextInt(100) * k;
				k = k * (-1);
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
				System.out.print("[" + tempArray[i]+ "] ");
		}
		System.out.print("\n");
	}

}
