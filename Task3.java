package by.epam.les09.main;

public class Task3 {
	//Дана матрица. Вывести на экран первый и последний столбцы.
	public static void main(String[] args){
		 int[][] mas = {{1,2,3,4}, {5,6,7,8}, {9,8,9,8},{7,5,7,5}};


			for (int i =0; i<mas.length; i++) {
					for (int j = 0; j < mas[i].length; j++) {
						System.out.print(mas[i][0] + "\t");
						System.out.print(mas[i][3] + "\t");
						break;
					
					}
					
					System.out.println();
				}
			
			
	}

}
