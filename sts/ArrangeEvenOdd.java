

import java.util.*;

class Node{
    int data;
    Node next;
    Node(int val){
        data = val;
        next = null;
    }
}

class LinkedListOperations{
    public Node ArrangeEvenOdd(Node head){
        if(head==null || head.next==null)
            return head;
        Node oddHead = null;
        Node oddTail = null;
        Node evenHead = null;
        Node evenTail = null;
        Node current = head;
        while(current!=null){
            if(current.data %2!=0){
                if(oddHead==null){
                    oddHead = current;
                    oddTail = current;
                }
                else{
                    oddTail.next = current;
                    oddTail = current;
                }
            }else{
                if(evenHead == null){
                    evenHead = current;
                    evenTail = current;
                }
                else{
                    evenTail.next = current;
                    evenTail = current;
                }
            }
            current = current.next;
        }
        // Handle edge cases: All even or all odd very important
        if (oddHead == null) return evenHead;
        if(evenHead == null) return oddHead;
        oddTail.next = evenHead;
        evenTail.next = null;
        //Don't return original head in edge case it might change
        return oddHead;

    }
    public Node takeInput(){
           Scanner sc = new Scanner(System.in);
           int data = sc.nextInt();
           Node head=null;Node tail=null;
           while(data!=-1){
            Node newNode = new Node(data);
            if(head == null && tail == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
            data = sc.nextInt();
           }
           return head;
    }
    public void printList(Node head){
        while(head !=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}

// main class
public class ArrangeEvenOdd{
    public static void main(String[]args){
        LinkedListOperations lsi = new LinkedListOperations();
        Node head = null;
        head = lsi.takeInput();
        head = lsi.ArrangeEvenOdd(head);
        lsi.printList(head);
    }
}