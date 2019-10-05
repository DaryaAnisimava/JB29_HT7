package by.epam.les09.main;

import java.util.Random;

public class Task11 {
	//Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа
	//налево, вторая строка слева направо, третья строка справа налево и так далее.
	public static void main(String[] args) {
		int[][]mas = new int[10][10];
		Random rand = new Random();
		int i;
		int j;
		for (i =0; i<mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
				System.out.print(mas[i][j] + "  ");
			}
			System.out.println();
		}
	
	System.out.println("Выводим элементы в разном порядке:");
	  for (i = 0; i<mas.length; i++) { 
	    if (i % 2 == 1) { 
	      for (j = 0; j < mas[i].length; j++) {
	    	  System.out.print("  " + mas[i][j]);
	      }
	      System.out.println();
	    }
	    else {
	      for (j = mas.length-1; j>=0; j--) {
	      System.out.print("  " + mas[i][j]);
	      }
	      System.out.println();
	    }
	  }
}
}