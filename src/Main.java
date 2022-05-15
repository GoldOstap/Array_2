import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int min=0; // минимальное значение
        int max=10; // максимальное значение
        Random rnd = new Random();
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int k = scan.nextInt();
        int[] myArray = new int[k];

        for (int t=0;t<myArray.length; t++)
            myArray[t] = rnd.nextInt((max - min) + 1) + min;

        for (int i : myArray)
            System.out.print(i + " ");

        System.out.println("\nВсе четные");
        for (int i : myArray) {
            if (i % 2 == 0 & i != 0) System.out.print(i + " ");
        }
    }
}