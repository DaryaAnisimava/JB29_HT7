package by.epam.les09.main;

public class Task19 {
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	public static void main(String[] args) {
	int n = 10;
	int j;
	int k;
	
	int[][]mas = new int[n+1][n+1];

	if (n % 2==0) {
		k=n / 2;
	}
			else {
				k=n /2+1;
				}
	for (int i =0; i<n; i++) {
		for (j = 0; j <n; j++) {
			if (i<=k) {
				
					    if ((j>=i)&&(j<=n-i-1)) { 
					    	mas[i][j]=1;
					    }
					    else {
					    	mas[i][j]=0;
					    }
					    }
			
					  else
					  {
					    if((j<=i)&&(j>=n-i-1)) {
					    	mas[i][j]=1;
					    }
					    
					    else 
					    	{mas[i][j]=0;
					    	}
					    	}
					  }
		
		
	}
	for (int i =0; i<n; i++) {
		for (j = 0; j <n; j++) {
			
			System.out.print(mas[i][j] + "\t");
		}
		System.out.println();
	}

	}
}
