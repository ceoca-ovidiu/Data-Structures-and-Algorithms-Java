// O(1) complexity

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Andrei", "Marginean", 1232);
        Employee employee2 = new Employee("Marcel", "Argi", 345);
        Employee employee3 = new Employee("Mirel", "Ean", 567);
        Employee employee4 = new Employee("Jana", "Margi", 766);
        Employee employee5 = new Employee("Jenuta", "Mar", 333);

        EmployeeDoublyLinkedList employeeDoublyLinkedList = new EmployeeDoublyLinkedList();

        employeeDoublyLinkedList.addToFront(employee1);
        employeeDoublyLinkedList.addToFront(employee2);
        employeeDoublyLinkedList.addToFront(employee3);
        employeeDoublyLinkedList.addToFront(employee4);
        employeeDoublyLinkedList.addToFront(employee5);

        employeeDoublyLinkedList.printList();
        System.out.println("The size of the list is : " + employeeDoublyLinkedList.getSize());

        Employee employee6 = new Employee("Bill", "Margi", 4543);

        employeeDoublyLinkedList.addToEnd(employee6);

        employeeDoublyLinkedList.printList();
        System.out.println("The size of the list is now : " + employeeDoublyLinkedList.getSize());

        employeeDoublyLinkedList.removeFromEnd();

    }

}
