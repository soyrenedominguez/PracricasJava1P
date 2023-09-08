package arrays;

import java.util.Scanner;

public class ArrayBidi {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("n->"); 
		int n=in.nextInt();
		int bidi[][]=new int[n][n];
		int suma[]=new int[n];
		//RELLENAR ARRAY BIDIMENCIONAL
		for (int i = 0; i < bidi.length; i++) {//filas
			for (int j = 0; j < bidi.length; j++) {//columnas
				bidi[i][j]=in.nextInt();
				suma[j]+=bidi[i][j];
			}
		}
		//IMPRIMIR ARRAY BIDIMENCIONAL
		for (int i = 0; i < bidi.length; i++) {
			for (int j = 0; j < bidi.length; j++) {
				System.out.print(bidi[i][j]+" "); 
			}
			System.out.println(""); 
		}
		
		for (int i = 0; i < suma.length; i++) {
			System.out.print(suma[i]+" "); 
		}
	}

}
