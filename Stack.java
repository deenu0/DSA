import java.util.*;
public class Stack {
   int top = -1;
   int n;
   int[] arr;
   public Stack(int n){
      this.n = n;
      arr = new int[n];
   }
   public void push(){
      if(top == n-1)
         System.out.println("Stack overflow...");
      else{
         top++;
         System.out.print("Enter value : ");
         Scanner scanner = new Scanner(System.in);
         arr[top] = scanner.nextInt();
      }
   }
   public void pop(){
      if(top == -1)
         System.out.println("Stack underflow...");
      else{
         System.out.println("Value popped : "+arr[top]);
         top--;
      }
   }
   public void peek(){
      if(top == -1)
         System.out.println("Stack underflow...");
      else{
         System.out.println("Top value is : "+arr[top]);
      }
   }
   public void display(){
      if(top == -1)
         System.out.println("Stack underflow...");
      else{
         System.out.println("Stack : ");
         for(int i = top;i > -1;i--){
            System.out.println(arr[i]);
         }
      }
   }
   public static void main(String[] args) {
      int size;
      System.out.print("Enter size of Stack : ");
      Scanner scanner = new Scanner(System.in);
      size = scanner.nextInt();
      Stack stack = new Stack(size);
      int choice = 1;
      while(choice != 0){
         System.out.println("Enter your choice : ");
         System.out.println("1. Push()...");
         System.out.println("2. Pop()...");
         System.out.println("3. Peek()...");
         System.out.println("4. Display()...");
         System.out.println("5. Exit...");
         choice = scanner.nextInt();
         if(choice == 1)
            stack.push();
         else if(choice == 2)
            stack.pop();
         else if(choice == 3)
            stack.peek();
         else if(choice == 4)
            stack.display();
         else{
            System.out.println("Stack Exited...");
            choice = 0;
         }
      }
   }
}