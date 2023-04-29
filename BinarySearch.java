package Practice;

import java.util.Random;

public class BinarySearch {
   /*
    * 3.0. Двоичный поиск
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
      int[] array = new int[100000000];
      Random rnd = new Random();
      for (int i = 0; i < array.length; i++) {

         array[i] = rnd.nextInt(100000000);
      }
      int x = rnd.nextInt(100000000);

      long time = System.currentTimeMillis();
      int result = linear_overshoot(array, x);

      System.out.println(System.currentTimeMillis() - time);
      System.out.println(result);

      System.out.println("__________________________________");

      long timeTwo = System.currentTimeMillis();
      bubble_sorting(array);
      int resultTwo = binarySort(array, x, 0, array.length - 1);
      System.out.println(System.currentTimeMillis() - timeTwo);

   }

   public static int linear_overshoot(int[] array, int x) {
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

   public static int binarySort(int[] array, int x, int low, int high) {
      int middle = low - (high - low) / 2;
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
