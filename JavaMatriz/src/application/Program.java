package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Leitura da tamanho da matriz.
		System.out.println("Enter the number of rows and columns: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int [][] mat = new int[m][n];
		
		//Inserindo elementos na matriz.
		for (int i=0; i<mat.length; i++) {
			System.out.println("Enter the elements of the row " + i + ":");
			for (int j=0; j<mat[i].length; j++) {
				mat [i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Final: ");
		
		//Exibindo matriz.
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				System.out.print(mat [i][j] + " ");
			}
			System.out.println();
		}
		
		//Leitura do número que se deseja buscar.
		System.out.println();
		System.out.println("Search: ");
		
		int x = sc.nextInt();
		
		//Exibindo elementos ao redor do número buscado.
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
				System.out.println();
				System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
