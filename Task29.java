package by.epam.les09.main;

import java.util.Random;

public class Task29 {
//Найти положительные элементы главной диагонали квадратной матрицы.
	public static void main(String[] args) {
		int i;
		int j;
		int n =10;
		int[][]mas = new int[n][n];
		Random rand = new Random();
		
		for (i =0; i<n; i++) {
			for (j = 0; j<n; j++) {
				mas[i][j] = rand.nextInt(100)-50;
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}
			for (i= 0; i<n; i++) {
				
				if (mas[i][i]>0) {
					System.out.println(mas[i][i] +"\t");
				}
				
				System.out.println();
			}
		}
	
}

   