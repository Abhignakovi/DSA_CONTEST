class MyQueue {
    private Stack<Integer> stack1=new Stack<>();
    private Stack<Integer> stack2=new Stack<>();

    public MyQueue() {
     
    }

    public void push(int x) {
        stack1.push(x);
    }

    private void shiftStacks() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }

    public int pop() {
        shiftStacks();
        return stack2.pop();
    }

    public int peek() {
        shiftStacks();
        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        System.out.println(myQueue.peek()); 
        System.out.println(myQueue.pop());  
        System.out.println(myQueue.empty());
    }
}
