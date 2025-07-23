import java.util.*;
public class Queue {
   int front = -1;
   int rear = -1;
   int n;
   int[] arr;
   public Queue(int n){
      this.n = n;
      arr = new int[n];
   }
   public void Enqueue(){
      if(rear == n-1)
         System.out.println("Queue overflow...");
      else{
         if(front == -1) 
            front = 0;
         rear++;
         System.out.print("Enter value : ");
         Scanner scanner = new Scanner(System.in);
         arr[rear] = scanner.nextInt();
      }
   }
   public void Dequeue(){
      if(front == -1 || front > rear)
         System.out.println("Queue underflow...");
      else{
         System.out.println("Value dequeued : "+arr[front]);
         front++;
         if(front > rear) {
            front = -1;
            rear = -1;
         }
      }
   }
   public void peek(){
      if(front == -1 || front > rear)
         System.out.println("Queue underflow...");
      else{
         System.out.println("Front value is : "+arr[front]);
      }
   }
   public void display(){
      if(front == -1 || front > rear) 
         System.out.println("Queue is empty...");
      else {
         System.out.println("Queue : ");
         for(int i = front; i <= rear; i++){
            System.out.println(arr[i]);
         }
      }
   }
   public static void main(String[] args) {
      int size;
      System.out.print("Enter size of Queue : ");
      Scanner scanner = new Scanner(System.in);
      size = scanner.nextInt();
      Queue queue = new Queue(size);
      int choice = 1;
      while(choice != 0){
         System.out.println("Enter your choice : ");
         System.out.println("1. Enqueue()...");
         System.out.println("2. Dequeue()...");
         System.out.println("3. Peek()...");
         System.out.println("4. Display()...");
         System.out.println("5. Exit...");
         choice = scanner.nextInt();
         if(choice == 1)
            queue.Enqueue();
         else if(choice == 2)
            queue.Dequeue();
         else if(choice == 3)
            queue.peek();
         else if(choice == 4)
            queue.display();
         else{
            System.out.println("Queue Exited...");
            choice = 0;
         }
      }
   }
}