public class ArrayStack {

    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity) {

        stack = new Employee[capacity];

    }

    public void push(Employee employee) {

        if (top == stack.length) {
            System.out.println("The stack is full so it is time to resize it");
            Employee[] newStack = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        stack[top++] = employee;

    }

    public Employee pop() {

        if (isEmpty()) {
            System.out.println("The stack is empty");
        }

        // we can consider resizing the stack

        Employee employee = stack[--top];
        stack[top] = null;

        return employee;
    }

    public Employee peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
        }

        return stack[top - 1];
    }

    public int getSize() {
        return top;
    }

    public void printStack() {

        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }

    }

    public boolean isEmpty() {
        return top == 0;
    }

}
