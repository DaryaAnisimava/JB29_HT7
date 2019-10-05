package by.epam.les09.main;
import java.util.Random;
import java.util.Scanner;

public class Task24 {
	//Дан линейный массив n n x , x , , x , x 1 2 −1  . Получить действительную квадратную матрицу порядка n:
	public static void main(String[] args) {
		int nmax = 100;
		int[][]array = new int[nmax][nmax];
		int [] mas = new int[20];
		int i;
		int j;
		Random rand = new Random();
		for (i=0; i<mas.length;i++) {
			mas[i] = 2*rand.nextInt(20)+1;
			System.out.print(mas[i]+"\t ");
		}
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n>");
		int n = sc.nextInt();
	
		for (i=0;i<n; i++) {
			array[i][0]=mas[i];
			for (j=0; j<n; j++) {
			for (i=1; i<n;i++) {
			array[i][j]=array[i-1][j]*mas[j];
			
			}
			
			}
			}
		
			for (i=0;i<n; i++) { 
		
			  for (j=0; j<n; j++){
					System.out.print(array[i][j]+"\t ");
			  
			}
			  System.out.println();
	
			}
			
}
}