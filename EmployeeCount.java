// Q17: Demonstrate static variable to count employees.

class EmployeeCount {
    String name;
    int id;
    static int count = 0;

    EmployeeCount(String n, int i) {
        name = n;
        id = i;
        count++;
    }

    static void displayCount() {
        System.out.println("Total Employees: " + count);
    }

    public static void main(String[] args) {
        new EmployeeCount("Rahul",1);
        new EmployeeCount("Amit",2);
        new EmployeeCount("Riya",3);

        displayCount();
    }
}
