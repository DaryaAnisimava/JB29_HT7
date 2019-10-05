package by.epam.les09.main;

public class Task18 {
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	public static void main(String[] args) {
		int n =10;
		int i;
		int j;
		int[][]mas = new int[n+1][n+1];
		
		
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++)
			{
			if(j>n-i-1) {
			mas[i][j]=0;
			}
			else {
			mas[i][j]=i+1;
			}
			System.out.print(mas[i][j] +"\t");
			}
			System.out.println();
	}
	
}

}
