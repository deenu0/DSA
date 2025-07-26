class Stack{
   int top = -1;
   int n;
   int[] arr2;
   public Stack(int n){
      this.n = n;
      arr2 = new int[n];
   }
   public void push(int data){
      if(top == n-1)
         System.out.println("Stack overflow...");
      else{
         top++;
         arr2[top] = data;
      }
   }
   public void display(){
      for(int i = 0;i <= top;i++){
         System.out.print(arr2[i] + " ");
      }
   }
}
public class Day18 {
   public static void main(String[] args) {
      int arr[] = {8,1,0,3,0,7};
      Stack stack = new Stack(arr.length);
      for(int i = 0;i < arr.length;i++){
         int count = 0;
         for(int j = i+1;j < arr.length;j++){
            if(arr[i] < arr[j]){
               stack.push(arr[j]);
               count++;
               break;
            }
         }
         if(count != 1){
            stack.push(-1);
         }
      }
      stack.display();
   }
}