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
        array[++top] = data;
    }

    // get and remove item from stack
    public int pop() {
        return array[y--];
    }

    // get item on top of stack
    public int peek() {
        return array[top];
    }

    // check if stack is empty
    private boolean isEmpty() {
        return top == -1;
    }

    // check is stack is full
    private boolean isFull() {
        return top == capacity - 1;
    }

}