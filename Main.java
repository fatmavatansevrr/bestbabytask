import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();
        String devam = "e";
        Scanner sc=new Scanner(System.in);
        while(devam.equals("e")){
            System.out.println("eklemek istediğiniz sayıyı girin");
            int eklenecek = sc.nextInt();
            Scanner sc_2 = new Scanner(System.in);
            System.out.println("eklemek yapmak istediğiniz metodu seçiniz:");
            String metot_tercihi = sc_2.next();
            if(metot_tercihi.equals("baş")){
                myLinkedList.insertAtFirst(eklenecek);
            }
            else if(metot_tercihi.equals("orta")){
                myLinkedList.insertAtMid(eklenecek);
            }
            else if(metot_tercihi.equals("son")){
                myLinkedList.insertAtEnd(eklenecek);
            }
        Scanner sc_3 = new Scanner(System.in);
        System.out.println("devam etmek istiyor musunuz:");
        devam = sc_3.next();
        }
        myLinkedList.display();

    }

    }

class Node{
    int data;
    Node next;

    // Constructor to create a new node
    Node(int d) {
        data = d;

    }
}
class LinkedList{
    static Node head;

    public void insertAtFirst(int x){
        // if list is empty
        if(head==null)
            head= new Node(x);
        else{
            Node newNode = new Node(x);
            newNode.next= head;
            head = newNode;
        }
    }

    public void insertAtMid(int x)
    {
        // if list is empty
        if (head == null)
            head = new Node(x);
        else {
            // get a new node
            Node newNode = new Node(x);

            Node ptr = head;
            int len = 0;

            // calculate length of the linked list
            //, i.e, the number of nodes
            while (ptr != null) {
                len++;
                ptr = ptr.next;
            }

            // 'count' the number of nodes after which
            // the new node is to be inserted
            int count = ((len % 2) == 0) ? (len / 2) :
                    (len + 1) / 2;
            ptr = head;

            // 'ptr' points to the node after which
            // the new node is to be inserted
            while (count-- > 1)
                ptr = ptr.next;

            // insert the 'newNode' and adjust
            // the required links
            newNode.next = ptr.next;
            ptr.next = newNode;
        }
    }
    public void insertAtEnd(int x){
        //if list is empty
        if(head==null)
            head= new Node(x);
        else{
            Node newNode = new Node(x);
            Node ptr = head;
            while(ptr.next==null){
                ptr.next = newNode;
                newNode.next=null;
            }
        }}
    // function to display the linked list
    public void display()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}
