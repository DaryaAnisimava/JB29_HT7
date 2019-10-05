package by.epam.les09.main;

import java.util.Scanner;

public class Task25 {
	//Получить квадратную матрицу порядка n:
	public static void main(String[] args) {
	int nmax = 100;
	int[][]array = new int[nmax+1][nmax+1];
	int i;
	int j;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n>");
	int n = sc.nextInt();
	
	for (i=1; i<=n; i++) { 
		   for (j=1; j<=n; j++) {
		   array[i][j]=(i-1)*n+j;
		     System.out.print(array[i][j]+"\t");
		   }
		  System.out.println();
	}
}
}
