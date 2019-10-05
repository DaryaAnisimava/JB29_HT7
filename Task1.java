package by.epam.les09.main;

public class Task1 {
	//Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица,
	//и вывести на экран
	public static void main(String[] args) {
		int[][] mas = new int[3] [4];
		mas[0][0] = 1;
		mas[1][0] = 1;
		mas[2][0] = 1;
		
	
 
 
		for (int i =0; i<mas.length; i++) {
				for (int j = 0; j < mas[i].length; j++) {
					System.out.print(mas[i][j] + "\t");
				}
				System.out.println();
			}
		
		
	}
	}

