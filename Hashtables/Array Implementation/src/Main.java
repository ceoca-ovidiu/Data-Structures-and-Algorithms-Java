// Abstract data type
// key/value pairs
// optimized for retrieval
// load factor tells us how full a hash table is

public class Main {

    public static void main(String[] args) {

        SimpleHashTable simpleHashTable = new SimpleHashTable(); // first name as a key

        simpleHashTable.put("John", new Employee("John", "Karter", 1234));
        simpleHashTable.put("Katy", new Employee("Katy", "Tres", 3290));
        simpleHashTable.put("Dennis", new Employee("Dennis", "Purto", 2389));
        simpleHashTable.put("Travis", new Employee("Travis", "Merty", 2901));
        simpleHashTable.put("Charlie", new Employee("Charlie", "Ferty", 2367));
        simpleHashTable.put("Stephan", new Employee("Stephan", "Berdan", 4578));

        simpleHashTable.printHashTable();

        System.out.println(simpleHashTable.get("Katy"));


    }

}
