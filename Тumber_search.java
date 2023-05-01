// package Practice;

// import java.util.Arrays;

public class Тumber_search {
   public static void main(String[] args) {
      // Напишите программу, которая выводит на консоль простые числа в промежутке от
      // [1, 100].
      // Используйте для решения этой задачи оператор "%" (остаток от деления) и
      // циклы.
      // arr();
      prime_number_search(arr_completion());
   }

   public static int[] arr_completion() {
      int[] array = new int[99];
      array[0] = 2;
      for (int i = 1; i < array.length; i++) {
         array[i] = array[i - 1] + 1;
      }
      return array;
   }

   public static void prime_number_search(int[] array) {
      for (int i = 0; i < array.length; i++) {
         Boolean flag = false;
         for (int j = 2; j < i; j++) {
            if (array[i] != j) {
               if (array[i] % j == 0) {
                  flag = true;
                  break;
               }
               
            }
         }
         if(flag){
            continue;
         }
         else{
            System.out.print(array[i]+ " . ");
         }
      }
   }
}
