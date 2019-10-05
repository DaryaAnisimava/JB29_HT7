package by.epam.les09.main;

public class Task4 {
	//Дана матрица. Вывести на экран первую и последнюю строки.
	public static void main(String[] args){
		 int[][] mas = {{1,2,3,4}, {5,6,7,8}, {9,8,9,8},{7,5,7,5}};
		 int i = 3;
		
			for (int j =0; j<mas[i].length;j++) {
				System.out.print(mas[0][j] + " ");
			}
			System.out.println();
			for (int j =0; j<mas[i].length;j++) {
				System.out.print(mas[3][j] + " ");
			}
	}


	}
