class Node{
   String data;
   Node next;
   Node prev;
   public Node(String data){
      this.data = data;
      this.next = null;
      this.prev = null;
   }
}
public class DLL {
   Node head;
   public void addToFirst(String data){
      Node newNode = new Node(data);
      if(head == null){
         head = newNode;
         return;
      }
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
   }
   public void addToLast(String data){
      Node newNode = new Node(data);
      if(head == null){
         head = newNode;
         return;
      }
      Node current = head;
      while(current.next != null){
         current = current.next;
      }
      current.next = newNode;
      newNode.prev = current;
   }
   public void addAtPosition(String data,int position){
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
      newNode.prev = current;
      if (newNode.next != null) {
          newNode.next.prev = newNode;
      }
   }
   public void reverseDisplay(){
      Node current = head;
      while(current.next != null){
         current = current.next;
      }
      while(current != null){
         System.out.print(current.data + "<>");
         current = current.prev;
      }
   }
   public void DisplayList(){
      if(head == null){
         System.out.println("List is empty...");
         return;
      }
      Node current = head;
      while(current != null){
         System.out.print(current.data+"<>");
         current = current.next;
      }
      System.out.println("null");
   }
   public static void main(String[] args){
      DLL list = new DLL();
      list.addToFirst("S");
      list.addToLast("G");
      list.addAtPosition("T",2);
      list.DisplayList();
      list.reverseDisplay();
   }
}
