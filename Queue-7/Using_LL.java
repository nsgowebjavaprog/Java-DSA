public class Using_LL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue {
        Node head = null;
        Node tail = null;

        public Queue() {
            head = null;
            tail = null;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                tail = head = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;
            if (head == tail) { // single node
                tail = null;
                head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Using_LL.Queue q = new Using_LL.Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        // q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}