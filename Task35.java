package by.epam.les09.main;

import java.util.Random;

public class Task35 {
//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
	public static void main(String[] args) {
		int[][]mas = new int[10][20];
		Random rand = new Random();
		int max =0;
		for (int i =0; i<mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(50);
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}
		
		for (int i =0; i<mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j]>max){
					max = mas[i][j];
					}
				}
		
	}
		System.out.println("max = " +max);
		
		System.out.println("После замены");
		
		for (int i =0; i<mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j]%2==1){
					mas[i][j] = max;
					System.out.print(mas[i][j] + "\t");
				}
		
	}
			
	}
		
		for (int i =0; i<mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
			
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
