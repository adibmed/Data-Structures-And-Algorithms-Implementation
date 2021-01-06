package stack;

public class Stack<T> {

    private int size;
    private int top;
    private Object[] stack;

    public Pile(int size) {
        stack = new Object[size];
        this.size = size;
        this.top = -1;
    }

    public T Pop() {
        if (isEmpty())
            throw new RuntimeException("Stack is empty");
        return (T) stack[top--];
    }

    public void Push(Object item) {
        if (top == size - 1)
            throw new RuntimeException("Stack is full");
        stack[++top] = item;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return size;
    }

    public void erase() {
        top = -1;
        size = 0;
    }
}
