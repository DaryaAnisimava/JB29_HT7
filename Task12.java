package by.epam.les09.main;

import java.util.Random;

public class Task12 {
//Получить квадратную матрицу порядка n:
	public static void main(String[] args) {
		int n =10;
		int i;
		int j;
		int[][]mas = new int[n][n];
		
		for (i =0; i<n; i++) {
			for (j = n-1; j >=0; j--) {
				if (i == n-j-1) {
			        mas[i][ j] = i;
				}
			            else {
			            	mas[i][ j] = 0;
			            	}
		
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}
	
	}
}
