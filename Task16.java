package by.epam.les09.main;

public class Task16 {
	//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	public static void main(String[] args) {
		int n =10;
		int i;
		int j;
		int[][]mas = new int[n+1][n+1];
		
		for (i =1; i<=n; i++) {
			for (j = n; j >0; j--) {
				if (i == n-j+1) {
			        mas[i][ j] = i * (i+1);
			      
				}
			            else {
			            	mas[i][ j] = 0;
			            	}
		
				System.out.print(mas[i][j] +"\t");
			}
			System.out.println();
		}
	
	}
}
