class Node{
  int data;
  Node next;
  public Node(int data){
    this.data = data;
    this.next = null;
  }
}

public class Day12{
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
        temp=temp.next;
    }
    if (temp==null) {
        System.out.println("Position out of bounds");
        return;
    }
    newNode.next = temp.next;
    temp.next = newNode;

  }
  public void deleteAtFirst(){
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    head = head.next;
  }
  public void deleteAtLast(){
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    if (head.next == null) {
        head = null;
        return;
    }
    Node current = head;
    while (current.next != null && current.next.next != null) {
        current = current.next;
    }
    current.next = null;
  }
  public void deleteAtPosition(int position) {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    if (position == 0) {
        head = head.next;
        return;
    }
    Node current = head;
    for (int i = 0; i < position - 1 && current != null; i++) {
        current = current.next;
    }
    if (current != null && current.next != null) {
        current.next = current.next.next;
    } else {
        System.out.println("Position out of bounds");
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
    Day12 list = new Day12();
    list.addToFirst(5);
    list.addToFirst(10);
    list.addToLast(100);
    list.addToPosition(50, 1);
    list.addToPosition(54, 2);
    list.deleteAtFirst();
    list.deleteAtLast();
    list.deleteAtPosition(0);
    list.Display();
  }
}