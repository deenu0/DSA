class Node{
  int data;
  Node next;
  Node prev;
  public Node(int data){
    this.data = data;
    this.next = null;
    this.prev = null;
  }
}
//Doubly Linked List
public class Day14{
  Node head;
  public void addToFirst(int data){
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
        return;
    }
    newNode.next = head;
    head.prev = newNode;
    head = newNode;
  }
  public void addToLast(int data){
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
        return;
    }
    Node temp = head;
    while (temp.next != null) { 
        temp = temp.next;
    }
    temp.next = newNode;
    newNode.prev = temp;
 }
  public void addToPosition(int position,int data){
    Node newNode = new Node(data);
    if (position == 0) {
        addToFirst(data);
        return;
    }
    Node temp = head;
    for (int i = 0; i < position - 1 && temp != null; i++) {
        temp = temp.next;
    }
    if (temp == null) {
        System.out.println("Position out of bounds");
        return;
    }
    newNode.next = temp.next;
    if (temp.next != null) {
        temp.next.prev = newNode;
    }
    temp.next = newNode;
    newNode.prev = temp;
  }
  public void deleteFirst() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    head = head.next;
    if (head != null) {
        head.prev = null;
    }
  }
  public void deleteLast() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    if (head.next == null) {
        head = null;
        return;
    }
    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }
    temp.prev.next = null;
  }
  public void deleteAtPosition(int position) {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    if (position == 0) {
        deleteFirst();
        return;
    }
    Node temp = head;
    for (int i = 0; i < position && temp != null; i++) {
        temp = temp.next;
    }
    if (temp == null) {
        System.out.println("Position out of bounds");
        return;
    }
    if (temp.next != null) {
        temp.next.prev = temp.prev;
    }
    if (temp.prev != null) {
        temp.prev.next = temp.next;
    }
  }
  public void PrintReverseList() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }
    while (temp != null) {
        System.out.print(temp.data + "<>");
        temp = temp.prev;
    }
    System.out.println();
  }
  void Display(){
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + "<>");
        temp = temp.next;
    }
    System.out.println();
  }
  public static void main(String[] args) {
    Day14 list = new Day14();
    list.addToFirst(10);
    list.addToLast(20);
    list.addToLast(30);
    list.addToLast(40);
    list.addToLast(50);
    list.addToLast(60);
    list.addToPosition(6, 70);
    list.deleteFirst();
    list.deleteLast();
    list.deleteAtPosition(1);
    list.PrintReverseList();
    list.Display();
  }
}