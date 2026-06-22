package LinkedList;
import java.util.Scanner;

public class Deletion{
     int data;
        Node next;
        Deletion(int data){
            this.data = data;
        }
        public static Node removeHead(Node Head){
            if (Head.next == null) return null;
            return Head.next;

        }
        public static Node removeTail(Node Head) {
            Node temp = Head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            return Head;

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
        public static Node removeKPosition(Node head, int k) {
            if (head == null) return null;
            if (head.data == 1) {
                return head.next;
            }
          //  int count = 0;
            Node prev = null;
            Node temp = head;
            while (temp != null) {

                if (temp.data == k) {
                    prev.next = temp.next;
                    break;
                }
                prev = temp;
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
        public static int lengthOfLL(Node head) {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
        public static boolean search(Node head, int x) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == x) return true;
                temp = temp.next;
            }
            return false;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = {1, 2, 23, 34, 44, 55, 67};

            Node head = convertArrayToLL(arr);
            display(head);
            System.out.println();

            int size = lengthOfLL(head);
            System.out.println("length of ll " + size);

            System.out.println("enter the element that you want to search" );
            int x = sc.nextInt();

            System.out.println(search(head, x));
            Node newHead = removeHead(head);
            display(newHead);
            System.out.println();

            newHead = removeTail(newHead);
            display(newHead);
            System.out.println("Enter the position you want to delete");

            int k = sc.nextInt();
            newHead = removeKPosition(newHead , k);
            display(newHead);
            System.out.println("Enter the value");


        }
    }


