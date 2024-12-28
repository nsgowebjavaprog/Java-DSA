class Rev_LL {
    public static void main(String[] args) {
        
        Node prev = null;
        Node next = null;
        Node curr = head;

        While(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}