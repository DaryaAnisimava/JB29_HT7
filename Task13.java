package by.epam.les09.main;
import java.util.Scanner;


public class Task13 {
	//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	public static void main(String[] args) {
		int k;
		int num;
		int n;
		Scanner s = new Scanner(System.in);
        System.out.println("Введите четное n : ");
        n=s.nextInt();
        k=1;
        num=n;
        
        int [] [] arr = new int  [n] [n];
        
        for(int i =0;i<arr.length;i++) {
            if(i%2==0) {
            for(int j =0;j<arr.length;j++) {
                arr[i][j]=k;
                k++;
            }
            k=1;
            }
            else {
                for(int j =0;j<arr.length;j++) {
                    arr[i][j]=num;
                    num--;;
                }
                num=n;
            }
        }
        
        for(int i =0;i<arr.length;i++) {
            for(int  j =0;j<arr.length;j++) {
                System.out.print(arr[i][j]+"\t");
            }System.out.println();
        }
}
}
