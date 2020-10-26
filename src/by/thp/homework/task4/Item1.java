package by.thp.homework.task4;

import java.util.Scanner;
import java.util.Random;

public class Item1 {
	public static void main (String[] args)
	{
		// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

		int N;

		System.out.print("Enter length N: ");
		N = setInt();

		int[][] arrayNN = new int[N][N];
		int[] diagonal = new int[N];

		arrayNN = setArray(N);
		
		for (int i = 0; i < arrayNN.length; i++) {
			diagonal[i] = arrayNN[i][i];
		}
		
		System.out.print("The original array: ");
		getMultiArray(arrayNN);
		
		System.out.print("\nDiagonal elements: ");
		getArray(diagonal);
		

	}

	public static int setInt() {

		Scanner tempPer = new Scanner(System.in);
		while (!tempPer.hasNextInt()) {
			System.out.println("Enter the correct value: ");
			tempPer.next();
		}
		return tempPer.nextInt();
	}

	public static int[][] setArray(int n) {

		int[][] tempArray = new int[n][n];
		Random getRandomInt = new Random();

		for (int i = 0; i < tempArray.length; i++) {
			for (int j = 0; j < tempArray[i].length; j++) {
				tempArray[i][j] = getRandomInt.nextInt(100);
			}
		}

		return tempArray;
	}
	
	public static void getMultiArray(int[][] tempArray){
		for (int i = 0; i < tempArray.length; i++) {
			System.out.print("\n");
			for (int j = 0; j < tempArray[i].length; j++) {
				System.out.print("[" + tempArray[i][j] + "] ");
			}
		}
		System.out.print("\n");
	}
	
	public static void getArray(int[] tempArray){
		System.out.print("\n");
		for (int i = 0; i < tempArray.length; i++) {
			System.out.print("[" + tempArray[i] + "] ");
		}
		
		System.out.print("\n");
	}
}
