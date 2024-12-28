class Solution {
    // Function to reverse the queue.
    public Queue<Integer> reverseQueue(Queue<Integer> queue) {
        // code here.
        Stack<Integer> st = new Stack<>();
        
        while(!queue.isEmpty()){
            st.push(queue.poll());
        }
        
        while(st.size() > 0){
            queue.add(st.pop());
        }
        return queue;
    }
}