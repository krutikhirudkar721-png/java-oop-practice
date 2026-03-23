// Q20: Demonstrate use of this keyword.

class ThisKeyword {
    String name;
    double salary;

    ThisKeyword(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        ThisKeyword e1 = new ThisKeyword("Rahul",50000);
        ThisKeyword e2 = new ThisKeyword("Amit",60000);

        e1.display();
        e2.display();
    }
}
