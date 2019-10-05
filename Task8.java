package by.epam.les09.main;

import java.util.Random;

public class Task8 {
	//Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди
	//элементов массива.
	public static void main(String[] args) {
		int n =10;
		int m = 6;
		int seven = 0;
		int[][]mas = new int[n][m];
		Random rand = new Random();
		
		for (int i =0; i<mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}
		
		for (int i =0; i<mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == 7) {
				seven ++;
				}
			}
			
		}
		System.out.print("seven = " + seven);
	}
}
