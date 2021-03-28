public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {

        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        if (head == null) {   // check if the list is empty
            tail = node;
        } else {
            head.setPrevious(node);
        }
        head = node;
        size++;

    }

    public void printList() {

        System.out.println("Printing the linked list");
        EmployeeNode current = head;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }

    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;
    }


    public EmployeeNode removeFromEnd() {

        if (isEmpty()) {
            return null;
        }

        EmployeeNode removeNode = tail;

        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;
        removeNode.setPrevious(null);
        return removeNode;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNode removeNode = head;

        if (head.getNext() == null) { // check if is the only node in the list
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

}
