public class ArrayQueue {

    private Employee queue[];
    private int front;
    private int back;


    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        if (back == queue.length) {
            System.out.println("The queue is full so it needs to resize.\nRESIZING...");
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }
        queue[back] = employee;
        back++;
    }


    public Employee remove() {

        Employee employee = null;
        if (getSize() == 0) {
            System.out.println("The queue is empty");
        } else {
            employee = queue[front];
            queue[front] = null;
            front++;
            if (getSize() == 0) {
                front = 0;
                back = 0;
            }
        }
        return employee;
    }

    public int getSize() {
        return back - front;
    }

    public Employee peek() {
        Employee employee = null;
        if (getSize() == 0) {
            System.out.println("The queue is empty");
        } else {
            employee = queue[front];
        }
        return employee;
    }

    public void printQueue() {

        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }

    }

}
