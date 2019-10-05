package by.epam.les09.main;

import java.util.Random;

public class Task38 {
	//Найдите сумму двух матриц
	public static void main(String[] args) {
		int n =5;
		int m =7;
		int a[][]= new int [n][m];
		int b[][]= new int [n][m];
		int c[][]= new int [n][m];
	

		Random rand = new Random();
		
		for (int i =0; i<n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = rand.nextInt(10);
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

	System.out.println();
	
	
	for (int i =0; i<n; i++) {
		for (int j = 0; j < n; j++) {
			b[i][j] = rand.nextInt(10);
			System.out.print(b[i][j] + "\t");
		}
		System.out.println();
	}

System.out.println();

	
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		for (int i =0; i<n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
	
	}

}
