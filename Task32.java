package by.epam.les09.main;

import java.util.Random;

public class Task32 {
//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
	public static void main(String[] args) {
		int i;
		int j;

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
		
		for(i = 0; i < n; i++)
	    {
	        for(j = 0; j < m; j++)
	        {
	            for (int o = 0; o < m-1; o++)
	            {
	                if (a[i][o] > a[i][o + 1])
	                {
	                    int tmp = a[i][o];
	                    a[i][o] = a[i][o + 1];
	                    a[i][o + 1] = tmp;
	                }
	 
	            }
	        }
	    }
	        
	    for (i=0;i< n; i++) {
	        for (j=0;j<m; j++) {
	        	System.out.print(a[i][j] + " \t");
	        
	        }
	        System.out.println();
	    }
	    
	    for(i = 0; i < n; i++)
	    {
	        for(j = 0; j < m; j++)
	        {
	            for (int o = 0; o < m-1; o++)
	            {
	                if (a[i][o] < a[i][o + 1])
	                {
	                    int tmp = a[i][o];
	                    a[i][o] = a[i][o + 1];
	                    a[i][o + 1] = tmp;
	                }
	 
	            }
	        }
	    }
	    
	    for (i=0;i< n; i++) {
	        for (j=0;j<m; j++) {
	        	System.out.print(a[i][j] + " \t");
	        
	        }
	        System.out.println();
	    }
	    
	            }
	        
	    }
	

