package by.epam.les09.main;

public class Task34 {
//Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце
//	число единиц равно номеру столбца.
	public static void main(String[] args) {
	int i;
	int j;
	int n =10;
	int m =20;
	int[][]a = new int[n][m];
	


	
	for (i = 0; i < n; i++) {
		for (j = 0; j < i; j++) {
			a[i][j] = 0;

		}

		for (j = i; j < m; j++) {
			a[i][j] = 1;

		}

	}
	
	for (i = 0; i < n; i++) {
		for (j = 0; j < m; j++) {
			System.out.print(a[i][j] + " \t");

		}
		System.out.println();
	}
}
}