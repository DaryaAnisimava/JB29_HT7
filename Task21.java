package by.epam.les09.main;

import java.util.Scanner;

public class Task21 {
	//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	public static void main(String[] args) {
		
		int [][]array = new int[20][20];
		int i;
		int j;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n>");
		int n = sc.nextInt();
		
		for (i=1;i<=n; i++) {
			for (j=1; j<=n; j++) {
				if (i<j) {
					array[i][j]=0;
				}else 
					{array[i][j]=n-i+j;
					}
		}
		}
		for (i=1; i<= n; i++) {
			for (j=1; j<=n; j++) {
				
			System.out.print(array[i][j]+" ");
			}
		
		
			System.out.println();
		}
		

		
		
	}	
}
