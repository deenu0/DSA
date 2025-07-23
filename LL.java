class Node {
   String data;
   Node next;
   Node(String data){
      this.data = data;
      this.next = null;
   }
}
public class LL {
   Node head;
   public void addToFirst(String data){
      Node newNode = new Node(data);
      if(head == null){
         head = newNode;
         return;
      }
      newNode.next = head;
      head = newNode;
   }
   public void addToLast(String data){
      Node newNode = new Node(data);
      if (head == null){
         head = newNode;
         return;
      }
      Node current = head;
      while(current.next != null)
         current = current.next;

      current.next = newNode;
   }
   public void addaAtPosition(String data,int position){
      if(position == 1){
         addToFirst(data);
         return;
      }
      Node current = head;
      for(int i = 1;i < position - 1;i++){
         current = current.next;
      }
      if(current == null){
         System.out.println("Position out of bounds...");
         return;
      }
      Node newNode = new Node(data);
      newNode.next = current.next;
      current.next = newNode;
   }
   public void deleteFirst(){
      if(head == null){
         System.out.println("List is empty...");
         return;
      }
      head = head.next;
   }
   public void deleteLast(){
      if(head == null){
         System.out.println("List is empty...");
         return;
      }
      if(head.next == null){
         head = null;
         return;
      }
      Node current = head;
      while(current.next.next != null)
         current = current.next;

      current.next = null;
   }
   public void deleteAtPosition(int position){
      if(position == 1){
         deleteFirst();
         return;
      }
      Node current = head;
      for(int i = 1;i < position - 1;i++){
         current = current.next;
      }
      if(current.next == null){
         System.out.println("Position out of bounds...");
         return;
      }
      current.next = current.next.next;
   }

   public void displayList(){
      if(head == null){
         System.out.println("List is empty...");
         return;
      }
      Node current = head;
      while(current != null){
         System.out.print(current.data +"->");
         current = current.next;
      }
      System.out.println("null");
   }
   public static void main(String[] args) {
      LL list = new LL();
      list.addToFirst("b");
      list.addToFirst("a");
      list.addToLast("c");
      list.addToLast("d");
      list.addToLast("e");
      list.addaAtPosition("f",4);
      list.displayList();
      list.deleteFirst();
      list.deleteLast();
      list.deleteAtPosition(3);
      System.out.println();
      list.displayList();
   }
}