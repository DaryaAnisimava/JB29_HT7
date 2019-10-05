package by.epam.les09.main;

import java.util.Random;

public class Task9 {
	//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
	public static void main(String[] args) {
		int[][]mas = new int[3][3];
		Random rand = new Random();
		
		for (int i =0; i<mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Элементы главной диагонали");
		  for (int i=0; i<3 ; i++) {
			  System.out.print(mas[i][i] +" " );
		  }
	}
}
