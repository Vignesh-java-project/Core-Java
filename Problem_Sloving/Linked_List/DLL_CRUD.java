import java.util.*;

class DLL {
    private Node head;
    private Node tail;  // Added tail for efficient tail operations

    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    public DLL() {
        head = null;
        tail = null;
    }

    public void addNodeAtHead(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    public void addNodeAtTail(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    public void addNodeAtIndex(int data, int index) {
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }
        Node node = new Node(data);
        if (index == 0) {
            addNodeAtHead(data);
            return;
        }
        Node temp = head;
        int count = 0;
        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }
        node.next = temp.next;
        node.prev = temp;
        if (temp.next != null) {
            temp.next.prev = node;
        } else {
            tail = node;  
        }
        temp.next = node;
    }

    public void deleteAtHead() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteAtTail() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || head == null) {
            System.out.println("Invalid index or list is empty");
            return;
        }
        if (index == 0) {
            deleteAtHead();
            return;
        }
        Node temp = head;
        int count = 0;
        while (temp != null && count < index) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }
        if (temp == tail) {
            deleteAtTail();
            return;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class DLL_CRUD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLL dll = new DLL();
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            dll.addNodeAtTail(sc.nextInt());
        }
        dll.display();

        dll.addNodeAtHead(10);
        dll.addNodeAtTail(20);
        dll.addNodeAtIndex(15, 2);
        dll.display();

        dll.deleteAtHead();
        dll.deleteAtTail();
        dll.deleteAtIndex(1);
        dll.display();
    }
}
