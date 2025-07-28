public class Recursion {
   public static void PrintNum(int num) {
      if (num == 0)
         return;

      System.out.println(num);
      PrintNum(num - 1);
   }
   public static void printSum(int i, int n, int sum){
      if(i > n){
         System.out.println(sum);
         return;
      }
      sum = sum + i;
      printSum(i+1,n,sum);
   }
   public static void Factorial(int i, int n, int fact){
      if(i > n){
         System.out.println(fact);
         return;
      }
      fact *= i;
      Factorial(i+1, n, fact);
   }
   public static void FibonacciSeries(int n,int a,int b) {
      if(n == 0)
         return;
      System.out.print(a+" , ");
      FibonacciSeries(n-1, b, a + b);
   }
   public static int CalcPower(int x, int n){
      if(x == 0){
         return 0;
      }
      if(n == 0){
         return 1;
      }
      int ans = x * CalcPower(x, n -1);
      return ans;
   }
   public static void main(String[] args) {
      // PrintNum(5);
      // printSum(1,10,0);
      // Factorial(1, 5, 1);
      // FibonacciSeries(10,0,1);
      // System.out.println(CalcPower(2,5));
      
   }
}