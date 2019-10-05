package by.epam.les09.main;

import java.util.Random;

public class Task10 {
	//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
	public static void main(String[] args) {
		int k = 3;
		int p = 7;
		int i;
		int j;
		int[][]mas = new int[8][8];
		Random rand = new Random();
		
		for (i =0; i<mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}
	
		System.out.println("k-я строка:");   
		for (i =0; i<mas.length; i++) {
				System.out.print(mas[k][i] + "\t");
			}
			System.out.println();
		
		System.out.println("p-й столец:");   
		for (i =0; i<mas.length; i++) {
			System.out.println(mas[i][p] + "\t");
		}
		System.out.println();
}
}
