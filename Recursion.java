import java.util.Scanner;

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
      if(x == 0)
         return 0;
      if(n == 0)
         return 1;
      int ans = x * CalcPower(x, n -1);
      return ans;
   }
   public static boolean Ifsorted(int[] arr,int n){
      if(n == 0 || n == 1)
         return true;
      return arr[n-1]<=arr[n] && Ifsorted(arr, n-1);
   }
   public static boolean BinarySearch(int[] arr,int tar,int l,int r){
      if(l>r)
         return false;
      int mid = (l+r)/2;
      if(tar==arr[mid])
         return true;
      else if(tar>arr[mid])
            return BinarySearch(arr, tar, mid+1, r);
      else
           return BinarySearch(arr, tar, l, mid-1);
   }
   public static boolean LinearSearch(int[] arr,int tar,int i){
      if(i==arr.length)
         return false;
      if(arr[i]==tar)
         return true;
      return LinearSearch(arr,tar,i+1);
   }
   public static int[] Merge(int[] left, int[] right) {
      int[] merged = new int[left.length + right.length];
      int i = 0, j = 0, k = 0;
      while (i < left.length && j < right.length) {
         if (left[i] <= right[j]) {
            merged[k++] = left[i++];
         } else {
            merged[k++] = right[j++];
         }
      }
      while (i < left.length) {
         merged[k++] = left[i++];
      }
      while (j < right.length) {
         merged[k++] = right[j++];
      }
      return merged;
   }
   public static int[] MergeSort(int[] arr, int l, int r) {
      if (l == r) {
         return new int[]{arr[l]};
      }
      int mid = (l + r) / 2;
      int[] left = MergeSort(arr, l, mid);
      int[] right = MergeSort(arr, mid + 1, r);
      return Merge(left, right);
   }
   public static void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
   }
   public static void Permutations(int[] arr, int l, int r) {
      if (l == r) {
         for (int num : arr) {
            System.out.print(num + " ");
         }
         System.out.println();
      }
      else {
         for (int i = l; i <= r; i++) {
            swap(arr, l, i);
            Permutations(arr, l + 1, r);
            swap(arr, l, i); // backtrack
         }
      }
   }
   
   public static void main(String[] args) {
      // PrintNum(5);
      // printSum(1,10,0);
      // Factorial(1, 5, 1);
      // FibonacciSeries(10,0,1);
      // System.out.println(CalcPower(2,5));
      // int[] arr = {2,4,7,8,31};
      // System.out.println(Ifsorted(arr, arr.length-1));
      // int[] arr2 = {2,4,6,8,10,12,14};
      // int tar2 = 11;
      // System.out.println(BinarySearch(arr2,tar2,0,arr2.length-1));
      // int[] arr3 = {2,4,6,8,10,12,14};
      // int tar3 = 11;
      // System.out.println(LinearSearch(arr3, tar3, 0));
      // int[] arr4 ={40,6,2,8,23,9,56};
      // int[] arr5 =MergeSort(arr4, 0, arr4.length-1);
      // for(int i: arr5){
      //    System.out.println(i);
      // }
      // int[] arr6 = {1,2,3,4};
      // Permutations(arr6,0,arr6.length-1);
      
   }
}