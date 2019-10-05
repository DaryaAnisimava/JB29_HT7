package by.epam.les09.main;

import java.util.Random;

public class Task28 {
	//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
	//столбец содержит максимальную сумму.
	public static void main(String[] args) {
			int sum;
			int maxsum = 0;
			int ax = 0;
			int n =2;
			int m =3;
			int[][]mas = new int[n][m];
			Random rand = new Random();
			
			for (int i =0; i<n; i++) {
				for (int j = 0; j < m; j++) {
					mas[i][j] = rand.nextInt(10);
					System.out.print(mas[i][j] + "\t");
				}
				System.out.println();
			}
			
			for (int j =0; j<m; j++) {
				
				sum =0;
				for (int i = 0; i < n; i++) {
					sum = sum +mas[i][j]; 
					if(sum>maxsum) {
					maxsum= sum;
					ax=j;
					}
				}
				System.out.println("sum="+sum);
				}
			System.out.println("maxsum="+maxsum +" in column # "+ax);
	}		
	}
