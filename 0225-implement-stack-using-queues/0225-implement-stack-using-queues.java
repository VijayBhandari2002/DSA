// class myQueue{
//     private int[] arr;
//     private int capacity;
//     private int front;
//     private int rear;
//     private int size;
//     myQueue(int capacity)
//     {
//         this.capacity = capacity;
//         arr = new int[capacity];
//         front =0;
//         rear =-1;
//         size =0;
//     }
//     public void enqueue(int element){
//         if(isFull()){
//             System.out.println("Queue is full");
//             return;
//         }
//         rear = (rear+1) % capacity;
//         arr[rear] = element;
//         size++;
//     }

//     public int dequeue(int element){
//         if(isEmpty())
//         {
//            return -1;
//         }
//         int element = arr[front];
//         front = (front +1)% capacity;
//         size--:
//         return element;
//     }
//     public boolean isFull(){
//         return size == capacity;
//     }
//     public boolean isEmpty(){
//         return size ==0;
//     }
//     public int size(){
//         return size;
//     }
//     public int peek(){
//         if(isEmpty()) {
//             return -1;
//         }
//         return arr[front];
//     }
// }
class MyStack {
    Queue<Integer> q;
    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */