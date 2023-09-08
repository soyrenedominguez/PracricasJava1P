package arrays;

import java.util.Scanner;

public class ArrayBidi2 {	
	static int n=0,m=0;
	static String nombres[][];

	public static void main(String[] args) {	
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		in.nextLine();
		nombres= new String[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("Nombre [" + i + "][" + j + "]->");
				nombres[i][j] = in.nextLine();
			}
		}
		imprimirArray();
		int a=0,b=0;
		do {
			a=in.nextInt();
			
		}while(a<0||a>=n);
		do {
			b=in.nextInt();
		}while(b<0||b>=m);
		in.nextLine();
		nombres[a][b]=in.nextLine();
		imprimirArray();
	}

	public static void imprimirArray() {
		// IMPRIMIR ARRAY
		System.out.println("\n*****************************\n");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(nombres[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("\n*****************************\n");
	}

}
