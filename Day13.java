class Node{
  int data;
  Node next;
  public Node(int data){
    this.data = data;
    this.next = null;
  }
}

public class Day13 {
  Node head;
  public void addToFirst(int data){
    Node newNode = new Node(data);
    if (head==null) {
        head=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
  }
  public void addToLast(int data){
    Node newNode = new Node(data);
    if (head==null) {
        head=newNode;
        return;
    }
    Node temp = head;
    while (temp.next!=null) { 
        temp=temp.next;
    }
    temp.next=newNode;
  }
  public void addToPosition(int data, int position){
    Node newNode = new Node(data);
    if (position==0) {
        addToFirst(data);
        return;
    }
    Node temp = head;
    for (int i = 0; i < position-1 && temp!=null; i++) {
        temp = temp.next;
    }
    if (temp == null) {
        System.out.println("Position out of bounds");
        return;
    }
    newNode.next = temp.next;
    temp.next = newNode;

  }
  void FindMiddle() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    System.out.println("Middle element: " + slow.data);
  }
  void removeDuplicate(){
    if (head == null) {
        return;
    }
    Node current = head;
    while (current != null && current.next != null) {
        if (current.data == current.next.data) {
            current.next = current.next.next; 
        } else {
            current = current.next; 
        }
    }
  }
  void Display(){
    Node temp = head;
    while (temp!=null) { 
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
  }
  public static void main(String[] args) {
    Day13 list = new Day13();
    list.addToFirst(1);
    list.addToFirst(1);
    list.addToFirst(2);
    list.addToFirst(3);
    list.addToFirst(1);
    list.addToLast(2);
    list.addToPosition(3, 2);
    list.addToPosition(1, 3);
    list.FindMiddle();
    list.Display();
    System.out.println();
    list.removeDuplicate();
    list.Display();
  }
}