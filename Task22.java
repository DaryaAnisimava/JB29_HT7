package by.epam.les09.main;
import java.util.Scanner;
public class Task22 {
	//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	public static void main(String[] args) {
	
	int [][]array = new int[100][100];
	int i;
	int j;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n>");
	int n = sc.nextInt();
	
	for(i=1; i<=n; i++) {
		for(j=1; j<=n; j++)
		{
		if(i==1) {
		array[i][j]=j;
		}
		else {
			if ((i+j)<=(n+1))
			{
				array[i][j] = array[i-1][j]+1;
			}else {
				array[i][j]=0;
			}
			
	
		}
		System.out.print(array[i][j] +"\t");
		}
		System.out.println();
}

}
}

