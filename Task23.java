package by.epam.les09.main;
import java.util.Scanner;
public class Task23 {
//Сформировать квадратную матрицу порядка N по правилу:
// A[I,J] = sin((I^2 - J^2)/N)
//	и подсчитать количество положительных элементов в ней.
	public static void main(String[] args) {
		int nmax = 100;
		double [][]array = new double[nmax][nmax];
		int i;
		int j;
		int k;
		int n;
		k =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n>");
		n = sc.nextInt();
		
		for (i=1; i<= n; i++) {
			for (j=1; j<=n; j++) {
			double z = Math.toRadians((i * i - j * j)/n);
			array[i][j] = Math.asin(z);	
			//System.out.print(array[i][j]+"\t ");
			if (array[i][j]>0) {
				k++;
			}
			System.out.print(array[i][j]+"\t ");
			}
		
		
			System.out.println();
	
		}
		System.out.println();
		System.out.println("Number of positive elements = " + k);
	}
}
