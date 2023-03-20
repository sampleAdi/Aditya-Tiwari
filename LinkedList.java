public class LinkedList {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;
    static int size;
    static int count;

    public void addfirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void middle() {
        count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            if (count == (size / 2) + 1) {
                System.out.println(temp.data);
                break;
            }
            temp = temp.next;
        }
    }

    public void printlist() {
        Node temp = head;
        if (head == null) {
            System.out.println("linkedlist is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deletefirst() {
        if (head == null) {
            System.out.println("nothing to delete");
            return;
        }
        head = head.next;
    }

    public void deletelast() {
        if (head == null) {
            System.out.println("nothing to delete");
            return;
        }
        Node secNode = head;
        Node lastNode = head.next;
        while (lastNode != null) {
            secNode = secNode.next;
            lastNode = lastNode.next;
        }
        System.out.println(secNode.data);

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(6);
        ll.addlast(7);
        ll.addlast(8);
        ll.addlast(9);
        ll.printlist();
        System.out.println(size);
        ll.middle();
    }
}
