package queue;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>(5);
        queue.Push(290);
        queue.Push(563);
        queue.Push(458);
        queue.Push(500);
        queue.Push(990);

        while (!queue.isEmpty())
            System.out.println(queue.Pop());

    }

}
