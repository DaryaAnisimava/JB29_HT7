package by.epam.les09.main;
import java.util.Random;
import java.util.Scanner;
public class Task27 {
/*В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца
	поставить на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера
	столбцов вводит пользователь с клавиатуры.
*/
	public static void main(String[] args) {
		int N = 3; 
		int M = 6;
	
   int[][] array = new int [N][M];
    int i,j,a,b,buff;
    Random rand = new Random();
  
    for (i=0; i<N; i++) {
        for (j=0; j<M; j++) { 
            array[i][j] = rand.nextInt(4);
            System.out.print(array[i][j] + "\t");
    }
       System.out.println();
    }
    
       System.out.println("Какие столбцы поменять местами: ");
       Scanner sc = new Scanner(System.in);
       a = sc.nextInt();
       b = sc.nextInt();
    for (i=0;i<N; i++) { 
        buff = array[i][a];
        array[i][a] = array[i][b];
        array[i][b] = buff;
    }
    
    for (i=0;i <N; i++) {
        for (j=0; j<M; j++) {
           System.out.print(array[i][j]+ "\t");
        }
        System.out.println();    }
    }

}
