class Node{
   int data;
   Node next;
   Node(int data){
      this.data = data;
      this.next = null;
   }
}
public class CircLL {
   //circular linked list implementation
   Node head;
   public static void main(String[] args) {
      CircLL cll = new CircLL();
      cll.add(1);
      cll.add(2);
      cll.add(3);
      cll.addToPosition(4, 2);
      cll.display();
   }
   public void addToPosition(int data, int position) {
      Node newNode = new Node(data);
      if (head == null) {
         head = newNode;
         newNode.next = head;
      } else if (position == 0) {
         newNode.next = head;
         Node temp = head;
         while (temp.next != head) {
            temp = temp.next;
         }
         temp.next = newNode;
         head = newNode;
      } else {
         Node temp = head;
         for (int i = 0; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
         }
         newNode.next = temp.next;
         temp.next = newNode;
      }
   }
   public void add(int data) {
      Node newNode = new Node(data);
      if (head == null) {
         head = newNode;
         newNode.next = head;
      } else {
         Node temp = head;
         while (temp.next != head) {
            temp = temp.next;
         }
         temp.next = newNode;
         newNode.next = head;
      }
   }
   public void display() {
      if (head == null) return;
      Node temp = head;
      do {
         System.out.print(temp.data + " ");
         temp = temp.next;
      } while (temp != head);
      System.out.println();
   }
}
