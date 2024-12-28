import org.w3c.dom.Node;

class Separate_Odd_Even_LL {
    Node divide(Node head) {

        Node even = new Node(0);
        Node odd = new Node(0);
        Node even_ptr = even;
        Node odd_ptr = odd;

        while (head != null) {
            if (head.data % 2 == 0) {

                even_ptr.next = head;
                even_ptr = even_ptr.next;
                head = head.next;
            } else {

                odd_ptr.next = head;
                odd_ptr = odd_ptr.next;
                head = head.next;
            }
        }
        even_ptr.next = odd.next;
        odd_ptr.next = null;
        return even.next;
    }
}