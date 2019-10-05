package by.epam.les09.main;

public class Task15 {
	//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	public static void main(String[] args) {
		int n =10;
		int i;
		int j;
		int[][]mas = new int[n+1][n+1];
		
		for (i =n; i>0; i--) {
			for (j = 1; j <=n; j++) {
				if (i == n-j+1) {
			        mas[i][ j] = i;
				}
			            else {
			            	mas[i][ j] = 0;
			            	}
		
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}
	
	}
}
