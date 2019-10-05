package by.epam.les09.main;

import java.util.Random;

public class Task31 {
	//Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество двузначных
	//чисел в ней.
	public static void main(String[] args) {
		int i;
		int j;
		int k=0;
		int n =10;
		int m =20;
		int[][]a = new int[n][m];
	
		Random rand = new Random();
		
		for (i =0; i<n; i++) {
			for (j = 0; j<n; j++) {
				a[i][j] = rand.nextInt(1000);
				System.out.print(a[i][j] + "\t");
			
			}
			System.out.println();
		}
		System.out.println();
		for (i =0; i<n; i++) {
			for (j = 0; j<n; j++) {
				if((a[i][j]> 9) &&(a[i][j]< 100)) {
					k++;
					}
				}
			}
		System.out.println("k=" + k);
}
}
