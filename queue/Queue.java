package queue;

public class File<T> {
    private Object[] queue;
    private int front;
    private int rear;
    private int size;

    public File(int size) {
        this.size = size;
        this.queue = new Object[size];
        this.front = -1;
        this.rear = -1;
    }

    public T Pop() {
        if (isEmpty())
            throw new RuntimeException("Queue is empty");
        T item = (T) queue[front];
        front++;
        return item;
    }

    public void Push(Object item) {
        if (isFull())
            throw new RuntimeException("Queue is full");
        rear++;
        queue[rear] = item;
        if (front == -1) front = 0;
    }

    public boolean isEmpty() {
        return (front == -1 || front > rear);
    }

    public int size() {
        return size;
    }

    public void erase() {
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return (rear == size - 1);
    }
}

