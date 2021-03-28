// abstract data type
// LIFO
// push
// pop
// peek
// linked list

public class Main {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Mary", "Jane", 2311));
        stack.push(new Employee("Blue", "May", 2121));
        stack.push(new Employee("Gary", "Jane", 6341));
        stack.push(new Employee("Sponge", "Bob", 2345));
        stack.push(new Employee("Pink", "Patrick", 9515));

        System.out.println("Peeking " + stack.peek());
        stack.printStack();

        stack.pop();

        stack.printStack();

    }

}
