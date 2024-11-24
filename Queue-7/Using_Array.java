public class Using_Array {
    private int max_Size;
    private int front;
    private int rear;
    private int current_Size;
    private int[] queue_Array;

    // Constructor
    public Using_Array(int size) {
        max_Size = size;
        front = 0;
        rear = -1;
        current_Size = 0;
        queue_Array = new int[max_Size]; // Initialize the array here
    }

    // 1. Add (Enqueue)
    public void add(int x) {
        if (isFull()) {
            System.out.println("Queue is Overflow");
            return;
        }
        rear = (rear + 1) % max_Size;
        queue_Array[rear] = x;
        current_Size++;
    }

    // 2. Remove (Dequeue)
    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is Under-Flow");
            return -1;
        }
        int temp = queue_Array[front];
        front = (front + 1) % max_Size;
        current_Size--;
        return temp;
    }

    // 3. Peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty");
            return -1;
        }
        return queue_Array[front];
    }

    // 4. Empty
    public boolean isEmpty() {
        return (current_Size == 0);
    }

    // 5. Is Full
    public boolean isFull() {
        return (current_Size == max_Size);
    }

    // 6. Print / Display
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        int temp = front;
        for (int i = 0; i < current_Size; i++) {
            System.out.print(queue_Array[temp] + " ");
            temp = (temp + 1) % max_Size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Using_Array queue = new Using_Array(5);

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("Queue elements:");
        queue.printQueue();

        System.out.println("Dequeued element: " + queue.remove());

        System.out.println("Front element: " + queue.peek());

        System.out.println("Is queue empty? " + queue.isEmpty());

        System.out.println("Is queue full? " + queue.isFull());
    }
}
// OUTPUT
// Queue elements:
// 10 20 30 40 50
// Dequeued element: 10
// Front element: 20
// Is queue empty? false
// Is queue full? false