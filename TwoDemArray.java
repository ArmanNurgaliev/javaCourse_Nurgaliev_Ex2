import java.util.*;
public class TwoDemArray {
	public static void main(String[] args) {
		// С клавиатуры вводится двумерный массив, длина его строк – 4, столбцов – 3.
		int rows = 4;
		int col = 3;
		int[][] arr = new int[rows][col];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

        System.out.println("Your array:");                	
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("%3d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();

// 		1.Напишите программу, которая выводит номера строк и суммы их элементов (пример: Line 2: 17).
		System.out.println("Sum in rows:");
		for (int i = 0; i < rows; i++) {
			int sum = 0;
			for (int j = 0; j < col; j++) {
				sum += arr[i][j];
			}
			System.out.println("Line " + i + ": " + sum);
		}
		System.out.println();

// 		2.Напишите программу, которая выводит номера столбцов и суммы их элементов (пример: Column 3: 21).
		System.out.println("Sum in columns:");
		for (int i = 0; i < col; i++) {
			int sum = 0;
			for (int j = 0; j < rows; j++) {
				sum += arr[j][i];
			}
			System.out.println("Line " + i + ": " + sum);
		}
		System.out.println();

// 		3.Напишите программу, которая заменяет все нечётные элементы массива на 1, а чётные на 0 и выводит его на экран.
		int[][] newArr = new int[rows][col];
		System.out.println("Array with 1 instead of odd numbers:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				newArr[i][j] = (arr[i][j] % 2 != 0) ? 1 : 0;
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("%3d ", newArr[i][j]);
			}
			System.out.println();
		}
		System.out.println();

// 		4.Напишите программу, которая для в каждой строке находит целое среднее арифметическое и выводит его на экран.
		System.out.println("Mean in rows:");
		for (int i = 0; i < rows; i++) {
			int sum = 0;
			for (int j = 0; j < col; j++) {
				sum += arr[i][j];
			}
			System.out.printf("Line %d: %.2f\n", i, (float) sum/col);
		}
		System.out.println();

// 		5.***Напишите программу, которая преобразует двумерный массив в перевёрнутый одномерный и выводит все элементы одномерного массива на экран.
		System.out.println("Reversed one-dementional array:");
		int[] simpleArr = new int[col*rows];
		int k = 0;
		for (int i = rows-1; i >= 0; i--) {
			for (int j = col-1; j >= 0; j--) {
				simpleArr[k++] = arr[i][j];
			}
		}
		for (int a: simpleArr)
			System.out.print(a + " ");
	}
}