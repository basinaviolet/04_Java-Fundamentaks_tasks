package by.thp.homework.task4;

import java.util.Random;
import java.util.Scanner;
import java.util.Math;

public class Item9 {
	public static void main(String[] args) {
		// Дан линейный массив x1 - xn. Получить действительную квадратную матрицу порядка n:
		
		int n;
		System.out.print("Enter lenth N: ");
		n = setInt();
		
		int[] arrayRow = new int[n];
		arrayRow = setarrayInt(n);
		
		double[][] arrayNN = new double[n][n];
		
		for (int i = 0; i < arrayNN.length; i++) {
			for (int j = 0; j < arrayNN[i].length; j++) {
				arrayNN[i][j] = Math.pow((double)arrayRow[j], (double)(i + 1));
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
	
	public static int[] setarrayInt(int n) {
		Random tempPer = new Random();
		int[] tempArray = new int[n];
		
		for (int i = 0; i < tempArray.length; i++) {
			tempArray[i] = tempPer.nextInt(10);
		}
		return tempArray;
	}

	public static void getMultiArray(double[][] tempArray) {
		for (int i = 0; i < tempArray.length; i++) {
			System.out.print("\n");
			for (int j = 0; j < tempArray[i].length; j++) {
				System.out.printf("[%.1f] ", tempArray[i][j]);
			}
		}
		System.out.print("\n");
	}

}
