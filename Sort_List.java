package Practice;

import java.util.Arrays;
import java.util.Random;

public class Sort_List {
   // Реализуйте алгоритм сортировки пузырьком для сортировки массива
   public static void main(String[] args) {
      int[] array = new int[20];

      for (int i = 0; i < array.length; i++) {
         Random rnd = new Random();
         array[i] = rnd.nextInt(100);
      }
      System.out.println(Arrays.toString(array));
      bubble_sorting(array);
      System.out.println(Arrays.toString(array));
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

}
