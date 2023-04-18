package Practice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Del_number {
   // Дан массив целых чисел и ещё одно целое число.
   // Удалите все вхождения этого числа из массива (пропусков быть не должно).

   public static void main(String[] args) {
      ArrayList<Integer> array = new ArrayList<>();
      int size = 100;

      for (int i = 0; i < size; i++) {
         Random rnd = new Random();
         array.add(rnd.nextInt(10));
      }
      System.out.print("Введите число: ");
      Scanner scan = new Scanner(System.in);
      int number = scan.nextInt();
      
      System.out.println(array);
      System.out.println("______________________________________________");
      ArrayList<Integer> arrayNew = new ArrayList<>();
      arrayNew = newArray(array, number);
      System.out.println(arrayNew);
      scan.close();
   }

   public static ArrayList<Integer> newArray(ArrayList<Integer> arr, int number) {
      ArrayList<Integer> lst = new ArrayList<>();
      for (int i = 0; i < arr.size(); i++) {
         if (arr.get(i) != number) {
            lst.add(arr.get(i));
         }
      }
      return lst;

   }
}
