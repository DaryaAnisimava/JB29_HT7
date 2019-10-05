package by.epam.les09.main;

import java.util.Random;

public class Task36 {
//Операция сглаживания матрицы дает новую матрицу того же размера, каждый элемент которой
//	получается как среднее арифметическое соседей соответствующего элемента исходной матрицы.
//	Построить результат сглаживания заданной матрицы
	public static void main(String[] args) {
		int n = 10;
		int i, j;
		int[][]mas = new int[n+1][n+1];
		int[][]sec= new int [n+1][n+1];
		Random rand = new Random();
		
		for (i =1; i<n; i++) {
			for (j = 1; j < n; j++) {
				mas[i][j] = rand.nextInt(50)+1;
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}
	
	System.out.println();
	
   for (i = 1; i < n; i++){
       int cnt = 0;
       int sum = 0;
       for (j = 1; j < n; ++j){
    	   for(int i1=i-1; i1<=i+1; i1++) {
    	   for(int j1=j-1; j1<j+1; j1++) {
    		
    		   if((i1>=0) && (i1<n) && (j1>=0) && (j1<n) && (i1!=i) || (j1!=j))
               {
                  sum =sum + mas[i1][j1];
                   cnt++;
               }

           sec[i][j] = sum / cnt;
         
    	   }
           }
       }
   }
 
   for (i =1; i<n;i++) {
		for (j = 1; j <n; j++) {
			
			System.out.print(sec[i][j] + "\t");
		}
		System.out.println();
	}

}
  }
	
