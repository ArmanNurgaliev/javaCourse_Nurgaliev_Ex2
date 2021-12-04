public class Arrays {
	public static void main(String[] args) {
		int[] arr = {3, 22, 1, 13, 4, 6, 16, 5};

		System.out.print("Array: ");
		for (int a: arr)
			System.out.print(a + " ");
		System.out.println();

		// 1.Напишите программу, которая выводит (через пробел) те элементы массива, которые являются чётными числами.
		System.out.print("Even numbers: ");
		for (int a: arr)
			if (a % 2 == 0)
			System.out.print(a + " ");


		System.out.println();

		// 2.Напишите программу, которая выводит все двузначные числа массива.
		System.out.print("Double figures: ");
		for (int a: arr)
			if (a > 9 && a < 100)
			System.out.print(a + " ");


		System.out.println();

		// 3.Напишите программу, которая выводит на экран наибольшее целое число этого массива.
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("Biggest number: " + max);

		// 4.Напишите программу, которая считает сумму элементов массива и выводит её на экран.
		int sum = 0;
		for (int a: arr) 
			sum += a;
		System.out.println("Sum: " + sum);

		// 5.***Напишите программу, которая переворачивает массив в обратном порядке.
		for (int i = 0; i < arr.length/2; i++) {
			int t = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = t;
		}
		System.out.print("Revers array: ");
		for (int a: arr)
			System.out.print(a + " ");
	}
}