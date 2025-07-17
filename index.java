public class index{
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={7,8,9,10,11};
        int sum1=0;
        

        for(int i=0;i<arr1.length; i++){
            sum1=sum1+arr1[i];
        } 
        System.out.println(sum1);
        int len=arr1.length+arr2.length;
        int[] arr3 = new int[len];
        
        for(int i=0;i<len;i++){
            if (i<arr1.length){
            arr3[i]=arr1[i];
                
            }
            else{
            arr3[i]=arr2[i-arr1.length];

            }
        }
        for(int i=0; i<arr3.length; i++){
            System.out.println(arr3[i]);
        }
        int maxval=arr3[0];

        for(int i=1;i<len;i++){
            if(maxval<arr3[i]){
                maxval=arr3[i];
            }
        }
        System.out.println(maxval);
        int[][] arr4={{1,2,3},{4,5,6},{7,8,9}};
    
        for(int i=0; i<arr4.length; i++){
            for(int j=0; j<arr4[i].length; j++){
                System.out.print(arr4[i][j]+" ");
            }
        System.out.println();
        }

        int maxval4 =0;
        for(int i=0; i<arr4.length; i++){
            for(int j=0; j<arr4[i].length; j++){
                maxval4=maxval4+arr4[i][j];
            }
        
        }
        System.out.println("sum="+maxval4);

    }
}
        