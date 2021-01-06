package stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(12);
        stack.push(10);
        stack.push(28);
        stack.push(67);
        stack.push(19);
        stack.push(88);

        // display all stack elements
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

}
