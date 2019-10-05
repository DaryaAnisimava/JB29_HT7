package by.epam.les09.main;

import java.util.Random;

public class Task37 {
	//Переставить строки матрицы случайным образом.
	public static void main(String[] args) {
		int n = 10;
	
		int[][]arr = new int[n][n];

		Random rand = new Random();
		
		for (int i =0; i<n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = rand.nextInt(10);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	System.out.println();
	
	for(int j=0;j<n;j++)
    {
    for (int i = 0;i<n;i++)
    {

    int tmp;
    for(int k = 0; k< n;k++)
    {
        tmp = arr[j][k];
        arr[j][k] = arr[i][k];
        arr[i][k] = tmp;
    }
    }
    }

	for (int i =0; i<n; i++) {
		for (int j = 0; j < n; j++) {
			System.out.print(arr[i][j] + "\t");
		}
		System.out.println();
	}
	
	
    }
}
