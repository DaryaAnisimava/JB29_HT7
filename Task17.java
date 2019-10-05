package by.epam.les09.main;



public class Task17 {
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	public static void main(String[] args) {
		int n = 10;
		int[][]mas = new int[n][n];
	
		
		for (int i =0; i<n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i==0)||(j==0)||(i==n-1)||(j==n-1)){
				mas[i][j] =1;
				
				}else {
				mas[i][j] = 0;
				}
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}
	
	}
}
