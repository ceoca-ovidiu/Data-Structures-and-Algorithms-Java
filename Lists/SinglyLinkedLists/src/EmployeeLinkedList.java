public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee) {

        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
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

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNode removeNode = head;
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
