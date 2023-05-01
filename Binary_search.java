// package Practice;

import java.util.Arrays;
import java.util.Random;

public class Binary_search {
   /*
    * 3.0. Двоичный поиск
    * 
    * 
    * Задача:
    * 
    * Напишите метод, который проверяет, входит ли в массив заданный элемент или
    * нет.
    * Используйте перебор и двоичный поиск для решения этой задачи.
    * Сравните время выполнения обоих решений для больших массивов (например,
    * 100000000 элементов).
    */

   public static void main(String[] args) {
      int[] array = new int[10000000];
      Random rnd = new Random();
      for (int i = 0; i < array.length; i++) {

         array[i] = rnd.nextInt(100);
      }
      int x = rnd.nextInt(100);
      // System.out.println(Arrays.toString(array));
      // System.out.println(x);


      long time = System.currentTimeMillis();
      int result = linear_overshoot(array, x);

      System.out.println(System.currentTimeMillis() - time);
      System.out.println(result);

      System.out.println("__________________________________");

      long timeTwo = System.currentTimeMillis();
      Arrays.sort(array); // сортировка намного быстрее этим методом, чем пузырьковой
      int resultTwo = binarySort(array, x, 0, array.length - 1);
      System.out.println(System.currentTimeMillis() - timeTwo);
      System.out.println(resultTwo);
   }

   public static Integer linear_overshoot(int[] array, int x) {
      int number = -1;
      for (int i = 0; i < array.length; i++) {
         if (array[i] == x)
            number = i;
      }
      return number;
   }

   public static void bubble_sorting(int[] array) {
      int length = array.length;
      while (length > 0) {
         for (int i = 0; i < length - 1; i++) {
            if (array[i] > array[i + 1]) {
               int temp = array[i];
               array[i] = array[i + 1];
               array[i + 1] = temp;
            }
         }
         length--;
      }
   }

   public static Integer binarySort(int[] array, int x, int low, int high) { 
      // {1. 8. 4. 5}, 4, 0, 3
      int middle = low + (high - low) / 2;  //  0+(3-0)/2 =2 
      if (low > high)
         middle = -1;
      else if (array[middle] == x)
         middle = x;
      else if (x < array[middle])
         binarySort(array, x, 0, middle - 1);
      else if (x > array[middle])
         binarySort(array, x, middle + 1, high);
      return middle;
   }
}
