import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k = 0;
        int min=0; // минимальное значение
        int max=10; // максимальное значение
        Random r = new Random();
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        k = scan.nextInt();
        int[] myArray = new int[k];
        for (int t=0;t<myArray.length; t++) {
            myArray[t] = r.nextInt((max - min) + 1) + min;
        }
        for (int t=0;t<myArray.length; t++) {
            System.out.print(myArray[t]+" ");
        }
        System.out.println("\nВсе четные");
        for (int t=0; t< myArray.length; t++){
            if (myArray[t]%2 ==0 & myArray[t] !=0) System.out.print(myArray[t]+" ");
        }
    }
}