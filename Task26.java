package by.epam.les09.main;

import java.util.Random;
import java.util.Scanner;

public class Task26 {
	/*С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с массивом следующие
	действия:
		а) вычислить сумму отрицательных элементов в каждой строке;
		б) определить максимальный элемент в каждой строке;
		в) переставить местами максимальный и минимальный элементы матрицы.
		*/
	public static void main(String[] args) {
		int i;
		int j;
		int max;
		int min;
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n>");
		int n = sc.nextInt();
		System.out.println("Enter m>");
		int m =sc.nextInt();
		int[][]array = new int[n][m];
		Random rand = new Random();
		
		for (i=0; i<n;i++) {
			for (j=0; j<m;j++) {
			array[i][j] = rand.nextInt(10)-5;
			System.out.print(array[i][j]+"\t ");
			}
			System.out.println();
		}
		
		for (i=0; i<n;i++) {
			int sum =0;
			for (j=0; j<m;j++) {
				if(array[i][j]<0) {
				sum = sum +array[i][j];
				}
		
			}
			System.out.println("sum= " + sum);
		}
		
		for (i=0; i<n;i++) {
			max = array[0][0];
			for (j=0; j<m;j++) {
			if(max<array[i][j]) {
				max = array[i][j];
			}
			
			}
			System.out.println("max= " + max);
		}
		
		
		max=array[0][0];
		min=array[0][0];
		for(i=0;i<n;i++) //находим максиммальный и мин элементы массива
		    {
		    for(j=0;j<m;j++)
		    {
		        if (max<array[i][j]) {
		        	max=array[i][j];
		        }
		        if (min>array[i][j]) {
		        	min=array[i][j];
		        }
		    }
		}
		for(i=0;i<n;i++)  //меняем местами максимальный и минимальный элемент массива
		    {
		    for(j=0;j<m;j++)
		    {
		    
		      if  (array[i][j]==min) {
		    	  array[i][j]=max;
		      
		      }else {
		    	  if (array[i][j]==max) {
		    	  array[i][j]=min;
		      }
		      }
		    }
		}
		
		for (i=0; i<n;i++) {
			for (j=0; j<m;j++) {
			System.out.print(array[i][j]+"\t ");
			}
			System.out.println();
		}
		
}	
}