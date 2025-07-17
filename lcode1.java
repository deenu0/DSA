//two sum
public class lcode1 {

    public static void main(String[] args) {
        int[] arr={2,7,9,0,5};

        int tar=9;

        for(int i=0;i<arr.length;i++){
            int temp=tar-arr[i];
            for(int j=0;j<arr.length;j++){
                if(arr[j]==temp){
                    System.out.print(arr[i]);
                    System.out.println(arr[j]);
                }
            }

        }

    }
    
    
}
