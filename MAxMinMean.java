// package Practice;

import java.util.Arrays;
import java.util.Random;

public class MAxMinMean {
   public static void main(String[] args) {
      /*
       * Заполните массив случайным числами и выведите максимальное,
       * минимальное и среднее значение.
       */

      int[] array = new int[20];

      for (int i = 0; i < array.length; i++) {
         Random rnd = new Random();
         array[i] = rnd.nextInt(100);
      }
      System.out.println(Arrays.toString(array));

      int min = 100, max = 0;
      float mean = 0.0f;
      for (int i = 0; i < array.length; i++) {
         if(array[i] > max)
            max = array[i];
         if(array[i] < min)
            min = array[i];
         mean += (float) array[i]/array.length;
      }

      System.out.println("Минимальное: " + min+"\nМаксимальное: " + max + "\nСреднее: " + mean);
   }
}
