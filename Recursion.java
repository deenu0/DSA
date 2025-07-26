public class Recursion {
   public static void PrintNum(int num) {
      if (num == 0)
         return;

      System.out.println(num);
      PrintNum(num - 1);
   }

   public static void main(String[] args) {
      PrintNum(5);
   }
}