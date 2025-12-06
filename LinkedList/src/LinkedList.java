public class LinkedList {
    Node head = null;
    Node tail = null;

    void add(int x) {

        Node eleman = new Node();

        eleman.data = x;
        eleman.next = null;

        if (head == null) {
            head = eleman;
            tail = eleman;
            System.out.println("Linked list created. First node added.");
        }
        tail.next = eleman;
        tail = eleman;
    }

    void printList() {
        if (head == null) {
            System.out.println("List empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }


}
