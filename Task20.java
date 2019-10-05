package by.epam.les09.main;

public class Task20 {
	//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	public static void main(String[] args) {
		int n = 10;
		int j;
		int i;
		
		int[][]mas = new int[n+1][n+1];
		
		for (i=1; i<=n; i++) {
			  
			   for (j=1; j<=n; j++) { 
			    {
			     if (((i>=j)&&(i+j<=n+1))||((i<=j)&&(i+j>=n+1))){
			    	 mas[i][j]=1;
			    			 }
			     else {
			    	 mas[i][j]=0;
			     }
			     System.out.print(mas[i][j] + "\t");
			     }
			     }
				System.out.println();
			    
			   }
		
		}
		
}
