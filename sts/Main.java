import java.util.Scanner;

class Node {
    int data;
    int priority;
    Node next;

    public Node(int data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
    }
}

class PriorityQueue {
    Node head;

    public PriorityQueue() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insert(int data, int priority) {
        Node newNode = new Node(data, priority);
        if (isEmpty() || priority < head.priority) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.priority <= priority) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        display();
    }

    public void delete() {
       if(isEmpty()){
          System.out.println("Error List Empty");
           return;
        }
        head = head.next;
       display();
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        Node current = head;
        System.out.print("Queue: ");
        while (current != null) {
            System.out.print(current.data + " " + current.priority + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue pq = new PriorityQueue();

        while (true) {
            int choice = scanner.nextInt();
            if (choice == 1) {
                int data = scanner.nextInt();
                int priority = scanner.nextInt();
                pq.insert(data, priority);
            } else if (choice == 2) {
                pq.delete();
            } else if(choice == 3){
              pq.display();
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Wrong Choice");
            }
        }
        scanner.close();
    }
}