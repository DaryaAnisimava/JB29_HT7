package by.epam.les09.main;

import java.util.Random;

public class Task30 {
	//Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк,
	//в которых число 5 встречается три и более раз.
	public static void main(String[] args) {
		int i;
		int j;
		int k=0;
		int n =10;
		int m =20;
		int[][]mas = new int[n][m];
		int[] row= new int[n];
		Random rand = new Random();
		
		for (i =0; i<n; i++) {
			int q =0;
			for (j = 0; j<n; j++) {
				mas[i][j] = rand.nextInt(15);
				System.out.print(mas[i][j] + "\t");
				if (mas[i][j] ==5) {
					q++;
				}
			
			}
			if (q>=3) {
				k++;
	        row[k] = i;
			}
			System.out.println();
		}
	
		
		System.out.println("Строки, в которых 3 и больше пятерок: ");
		for (i=1;i<k; i++) {
		    System.out.print(row[i] + "  ");
		}
		System.out.println();
		
}
}
