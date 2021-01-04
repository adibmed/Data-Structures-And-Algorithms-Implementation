package stack;
public class Stack {

    private int array[];
    private int top;
    private int capacity;

    // Initialize stack
    public Stack(int capacity) {
        this.array = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }

    // add item to stck
    public void push(int data) {
      if(isFull()) {
        throw new RuntimeException("Stack is full");
      }
        array[++top] = data;
    }

    // get and remove item from stack
    public int pop() {
      if(isEmpty()) {
        throw new RuntimeException("Stack is empty");
      }
        return array[top--];
    }

    // get item on top of stack
    public int peek() {
      if(isEmpty()) {
        throw new RuntimeException("Stack is empty");
      }
        return array[top];
    }

    // check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // check is stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

}