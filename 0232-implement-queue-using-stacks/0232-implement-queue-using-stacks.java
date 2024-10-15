class MyStack{
    private int top;
    private int[] arr;

    MyStack(){
        arr = new int[1000];
        top =-1;
    }
    public void push(int x){
        if(top == arr.length-1){
            return;
        }
        top++;
        arr[top] = x;
    }

    public int pop(){
        if(top == -1){
            return -1;
        }
        int x = arr[top];
        top--;
        return x;
    }
    public int peek(){
        return arr[top];
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
}
class MyQueue {
    private MyStack s1;
    private MyStack s2;

    public MyQueue() {
        s1 = new MyStack();
        s2 = new MyStack();
    }
    
    public void push(int x) {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    
    public int pop() {
        if(s1.isEmpty()){
            return -1;
        }
        int x = s1.peek();
        s1.pop();
        return x;

    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */