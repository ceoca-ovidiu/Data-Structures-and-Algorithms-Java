public class Main {

    public static void main(String[] args) {

        ArrayQueue arrayQueue = new ArrayQueue(10);

        arrayQueue.remove();

        arrayQueue.add(new Employee("Dan","Pep",1322));
        arrayQueue.add(new Employee("John","Set",1122));
        arrayQueue.add(new Employee("Daniel","Werg",9518));
        arrayQueue.add(new Employee("Andrew","Uoew",1045));
        arrayQueue.add(new Employee("Owen","Qoer",1052));

        arrayQueue.printQueue();

        System.out.println(arrayQueue.peek());

        System.out.println(arrayQueue.getSize());

        arrayQueue.remove();

        System.out.println(arrayQueue.peek());

        System.out.println(arrayQueue.getSize());

        arrayQueue.printQueue();

    }
}
