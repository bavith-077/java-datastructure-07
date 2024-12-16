//program to add the element at first in the linked list :
public class addfirstLList {
    public static void main(String args[]) {
        LinkedList nums = new LinkedList();
        nums.add(5);
        nums.add(9);
        nums.add(6);
        nums.addFirst(1);
        nums.printValues();
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head = null;

    // Method to add a new element to the linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, make the new node the head
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Traverse to the end of the list
            }
            current.next = newNode; // Link the new node at the end
        }
    }

    // Method to print all elements of the linked list
    public void printValues() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;

    }
}