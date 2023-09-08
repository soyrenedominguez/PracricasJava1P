package arrays;

import java.util.Scanner;

public class Array01 {
	public static void main(String[] cecylover) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int a[] = new int[x];
		int suma = 0, multi = 1;
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
			suma += a[i];
			multi *= a[i];
		}
		System.out.println("IMPRIMIR ARRAY");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\nIMPRIMIR ARRAY AL REVES");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\nSUMA:" + suma);
		System.out.println("MULTIPLICACIÓN:" + multi);

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < (a.length - 1 - i); j++) {
				if (a[j] > a[j + 1]) {
					int aux = a[j];
					a[j] = a[j + 1];
					a[j + 1] = aux;
				}
			}
		}
		System.out.println("ARRAY ORDENADO");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\nARRAY ORDENADO AL REVES");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
		
	}
}
