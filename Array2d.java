import java.util.Scanner;
public class Array2d{
    public static void main(String [] args){

        Scanner system = new Scanner(System.in);

        //initialising a 2D array

        int r,c;
        System.out.println("Enter the number of rows:");
        r = system.nextInt();
        System.out.println("Enter the number of columns:");
        c = system.nextInt();

        int[][] arr= new int[r][c];

        System.out.println("Enter the elements of the array; ");
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = system.nextInt();
            }
        }
        System.out.println("The elements of the array are: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //Finding the sum of all elements in the 2D array
        int sum = 0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                sum += arr[i][j];
            }
        }
        System.out.println("The sum of all elements in the array is: " + sum);

        //Finding the maximum element in the 2D array
        int max = arr[0][0];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The maximum element in the array is: " + max);

        //Finding the minimum element in the 2D array
        int min = arr[0][0];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("The minimum element in the array is: " + min);

        //Finding the transpose of the 2D array
        int[][] transpose = new int[c][r];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                transpose[j][i] = arr[i][j];
            }
        }
        System.out.println("The transpose of the array is: ");
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        
    }
    
}
