public class SimpleHashTable {

    private Employee[] hashtable;

    public SimpleHashTable() {
        hashtable = new Employee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null) {
            System.out.println("There is already an employee on that position");
        } else {
            hashtable[hashedKey] = employee;
        }
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    private int hashKey(String key) {                // hash function
        return key.length() % hashtable.length ;
    }

    public void printHashTable() {
        for (Employee employee : hashtable) {
            System.out.println(employee);
        }
    }
}
