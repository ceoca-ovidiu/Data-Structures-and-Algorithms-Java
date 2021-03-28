// O(1) complexity

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Andrei", "Marginean", 1232);
        Employee employee2 = new Employee("Marcel", "Argi", 345);
        Employee employee3 = new Employee("Mirel", "Ean", 567);
        Employee employee4 = new Employee("Jana", "Margi", 766);
        Employee employee5 = new Employee("Jenuta", "Mar", 333);


        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
        employeeLinkedList.addToFront(employee1);
        employeeLinkedList.addToFront(employee2);
        employeeLinkedList.addToFront(employee3);
        employeeLinkedList.addToFront(employee4);
        employeeLinkedList.addToFront(employee5);

        System.out.println("The size of the list is " + employeeLinkedList.getSize());
        employeeLinkedList.printList();
        System.out.println("Is the list empty : " + employeeLinkedList.isEmpty());
        System.out.println("Removing the first employee");
        employeeLinkedList.removeFromFront();
        System.out.println("The size of the list is now " + employeeLinkedList.getSize());

    }

}
