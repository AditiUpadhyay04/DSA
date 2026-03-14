package LinkedList;

import java.util.Scanner;

public class Insertion {
    int data;
    Node next;
    public Insertion(int data){
        this.data = data;
    }

    public static Node InsertAtHead(Node head){
        if(head == null){
            return new  Node(55);
        }
        Node newHead = new Node(55);
        newHead.next = head;
        return newHead;
    }
    public static Node InsertTail(Node head){

        if(head == null) return new Node(23);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node n = new Node(44);
        temp.next = n;
        return head;
    }
    public static Node InsertAtKPosition(Node head , int k){
        if(head == null) {
            if(k == 1){
                Node n = new Node(45);
                return n;
            }
            else{
                return null;
            }
        }
        if(k == 1){
            Node n = new Node(45);
            n.next = head;
            return n;
        }
        int count = 0;
        Node temp = head;

        while(temp != null){
            count ++;
            if(count == k - 1){
                Node n = new Node(45);
                n.next = temp.next;
                temp.next = n;
                break;
            }
            temp = temp.next;

        }
        return head;
    }
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static Node convertArrayToLL(int[] arr) {
        int n = arr.length;
        Node n1 = new Node(arr[0]);
        Node head = n1;
        for (int i = 1; i < n; i++) {
            Node temp = new Node(arr[i]);
            n1.next = temp;
            n1 = temp;
        }
        return head;
        }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 23, 34, 44, 55, 67};

        Node head = convertArrayToLL(arr);
        display(head);
            System.out.println();

        head = InsertAtHead(head);
        display(head);
            System.out.println();

        head = InsertTail(head);
        display(head);
            System.out.println("Enter the value K");
        int k = sc.nextInt();
        head = InsertAtKPosition(head , k);
        display(head);

    }
}
