package by.epam.les09.main;

import java.util.Random;

public class Task33 {
	//Отсотрировать стобцы матрицы по возрастанию и убыванию значений элементов.
	public static void main(String[] args) {
		int i;
		int j;
		int n =10;
		int m =20;
	
		int[][]a = new int[n][m];
	
		Random rand = new Random();
		
		for (i =0; i<n; i++) {
			for (j = 0; j<m; j++) {
				a[i][j] = rand.nextInt(1000);
			
			}
		
		}
		
		 for ( int r = 0; r <a.length; ++r ) {
	            for ( int c = 0; c < a[r].length; ++c ) {
	                int lastC = c + 1;
	                for ( int lastR = r; lastR < a.length; ++lastR ) {
	                    while ( lastC < a[lastR].length) {
	                        if ( a[lastR][lastC] < a[r][c] ) {
	                            int tmp = a[r][c];
	                            a[r][c] = a[lastR][lastC];
	                            a[lastR][lastC] = tmp;
	                        }
	                        ++lastC;
	                    }
	                    lastC = 0;
	                }
	            }
	        }
	        
		 System.out.println("Сортировка по возрастанию:");
	        for (i = 0; i < a.length; ++i )
	            System.out.println(java.util.Arrays.toString(a[i]));
	    

	
	for ( int r = 0; r <a.length; ++r ) {
        for ( int c = 0; c < a[r].length; ++c ) {
            int firstC = c + 1;
            for ( int firstR = r; firstR < a.length; ++firstR ) {
                while ( firstC < a[firstR].length) {
                    if ( a[firstR][firstC] > a[r][c] ) {
                        int tmp = a[r][c];
                        a[r][c] = a[firstR][firstC];
                        a[firstR][firstC] = tmp;
                    }
                    ++firstC;
                }
                firstC = 0;
            }
        }
    }
    
 System.out.println("Сортировка по убыванию:");
    for (i = 0; i < a.length; ++i )
        System.out.println(java.util.Arrays.toString(a[i]));
}
	    
	
		}
		
		

	

		


