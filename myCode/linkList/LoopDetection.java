import java.util.*;

class Node{
    int num;
    Node next;
    Node (int val){
        num = val;
        next = null;
    }
}
public class LoopDetection {
    static Node insertNode(Node head,int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return head;    
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
    static void display(Node head){
        Node temp = head;
        while(temp.next!=null){
            System.out.print(temp.num+"->");
            temp = temp.next;
        }
        System.out.print(temp.num+"->NULL");
        System.out.println();
    }
    static void createCycle(Node head,int a,int b){
        int cnta=0,cntb=0;
        Node p1 = head;
        Node p2 = head;
        while(cnta!=a || cntb!=b){
           if(cnta!=a){
            p1= p1.next;
            cnta++;
           } 
            if(cnta!=b){
            p2= p2.next;
            cntb++;
           }
        }
        p2.next = p1;
    }
    static boolean detectCycle(Node head){
        Node fast = head;
        Node slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast) 
                return true;
        }
        return false;
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of values: ");
        int n = sc.nextInt();
        Node head = null;
        System.out.println("Enter "+n+" values");
        for(int i =1;i<=n;i++){
            int value = sc.nextInt();
            head = insertNode(head, value);
        }
        display(head);
        System.out.println("At which posistion you want to make cycle, enter");
        int k = sc.nextInt();
        createCycle(head, 1,k);
        // display(head);
        if(detectCycle(head)==true)
            System.out.println("Cycle detected");
        else
            System.out.println("There is no cycle");


    }
}
