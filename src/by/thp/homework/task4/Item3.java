package by.thp.homework.task4;

import java.util.Random;
import java.util.Scanner;

public class Item3 {
	public static void main(String[] args) {
		// Дана матрица размера m x n. 
		//Вывести ее элементы в следующем порядке: первая строка справа налево, вторая строка слева направо, третья строка справа налево и так далее.
		
		int n, m;
	
		System.out.print("Enter lenth N: ");
		n = setInt();

		System.out.print("Enter width M: ");
		m = setInt();

		int[][] arrayMN = new int[m][n];
		int[][] newArrayMN = new int[m][n];
		arrayMN = setMultiArray(m, n);

		System.out.print("The original array: ");
		getMultiArray(arrayMN);
		
		int k;
		for (int i = 0; i < arrayMN.length; i++) {
			if ((i+1) % 2 == 0) {
				for (int j = 0; j < arrayMN[i].length; j++) {
					newArrayMN[i][j] = arrayMN[i][j];
				}
			} else {
				k = 0;
				for (int j = arrayMN[i].length-1; j >= 0; j--) {
					newArrayMN[i][k] = arrayMN[i][j];
					k++;
				}
			}
			
		}

			System.out.print("The new array: ");
			getMultiArray(newArrayMN);

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

}
