import java.util.*;
public class Queen {
   public static boolean isSafe(char[][] arr, int row, int col,int n) {
      // Check column
      for (int i = 0; i < row; i++) {
         if (arr[i][col] == 'Q') {
            return false;
         }
      }
      // Check left diagonal
      for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
         if (arr[i][j] == 'Q') {
            return false;
         }
      }
      // Check right diagonal
      for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
         if (arr[i][j] == 'Q') {
            return false;
         }
      }
      return true;
   }
   public static boolean placeQueen(char[][] arr, int row, int n) {
      if (row == n) {
         return true; // All queens are placed
      }
      for (int col = 0; col < n; col++) {
         if (isSafe(arr, row, col, n)) {
            arr[row][col] = 'Q'; // Place queen
            if (placeQueen(arr, row + 1, n)) {
               return true; // Continue to place next queen
            }
            arr[row][col] = '.'; // Backtrack
         }
      }
      return false; // No valid position found
   }
   public static void printQueen(char[][] arr, int row, int col) {
      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
            if (i == row && j == col) {
               System.out.print("Q ");
            } else {
               System.out.print(arr[i][j] + " ");
            }
         }
         System.out.println();
      }
   }
   public static void main(String[] args) {
      // System.out.print("Enter size of rows and columns : ");
      // Scanner scanner = new Scanner(System.in);
      // int n = scanner.nextInt();
      int n = 6;
      char[][] arr = new char[n][n];
      for(int i = 0;i<n;i++){
         for (int j=0;j<n;j++){
            arr[i][j]='.';
         }
      }
      placeQueen(arr, 0, n);
      printQueen(arr, n, n);
   }
}
