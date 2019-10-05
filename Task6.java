package by.epam.les09.main;

public class Task6 {
	//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше
	//последнего.
	public static void main(String[] args){
		 int[][] mas = {{9,9,3,6}, {5,6,7,8}, {9,8,9,8},{7,5,7,5}};
	
		
		 for (int i =0; i<mas.length; i++) {
			for (int j =0; j<mas[i].length;j++) {
				if((j % 2 !=0)&&(mas[0][j]>mas[3][j])) {
				System.out.println(mas[i][1] + " ");
				
				break;
				}
			}
		 }
		 System.out.println();
		 for (int i =0; i<mas.length; i++) {
				for (int j =0; j<mas[i].length;j++) {
					if((j % 2 !=0)&&(mas[0][j]>mas[3][j])) {
					System.out.println(mas[i][3] + " ");
					break;
					}
				}
			 }
}
}