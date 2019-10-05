package by.epam.les09.main;

import java.util.Random;

public class Task7 {
	//Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.
	public static void main(String[] args) {
		int[][]mas = new int[5][5];
		int sum = 0;
		Random rand = new Random();
		
		for (int i =0; i<mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10)-5;
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}
		for (int i =0; i<mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
		
				if (mas[i][j]<0) {
					sum = sum + Math.abs(mas[i][j]);}
				}
					
	}
		System.out.println("sum=" + sum);	
}
}