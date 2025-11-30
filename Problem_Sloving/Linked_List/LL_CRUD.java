import java.util.*;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    private Node head;
    public LinkedList(){
        this.head = null;
    }

    // Add Node
    public void addNode(int data){
        Node node = new Node(data);
        if(head ==null){
            head = node;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp= temp.next;
            }
            temp.next = node;
        }
    }
    // insert at first element
    public void insertfirst(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        else{
            node.next = head;
            head = node;
        }
    }
    // insert at particular index
    public void InsertAtIndex(int data,int ind){
        Node node = new Node(data);
        if(head == null){
            if(ind > 0){
                System.out.println("List Size exceeded");
            }
            head = node;
        }
        else{
            int count =0;
            Node temp = head;
            // legth of list
            while(temp.next != null){
                temp = temp.next;
                count++;
            }
            if(count < ind ){
                System.out.println("List Size exceeded");
            }
            else{
                count = 0;
                temp =head;
                while(count < ind-1){
                    temp = temp.next;
                    count++;
                }
                node.next = temp.next;
                temp.next = node;
            }
        }
    }
    // search element
    public boolean search(int toSearch){
        if(head == null){
            return false;
        }
        else{
            Node temp = head;
            while(temp != null){
                if(temp.data == toSearch){
                    return true;
                }
                temp =temp.next;
            }
            return false;
        }
    }
    // Display list
    public void display(){
        if(head == null){
            System.out.println("Empty list");
        }
        else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
}
public class LL_CRUD{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.addNode(sc.nextInt());
        }

        list.display();

        list.insertfirst(50);
        list.InsertAtIndex(60,2);
        System.out.println();
        list.display();

    }
}