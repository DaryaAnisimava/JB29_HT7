package by.epam.les09.main;

public class Task5 {
	//Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.
	public static void main(String[] args){
		 int[][] mas = {{1,2,3,4}, {5,6,7,8}, {9,8,9,8},{7,5,7,5}};

		 for (int i =0; i<mas.length; i++) {
				for (int j = 0; j < mas[i].length; j++) {
					if(i % 2 ==0) {
						System.out.print(mas[i][j] + " ");
			 }
				}
						System.out.println();
				}
			
	
}
}