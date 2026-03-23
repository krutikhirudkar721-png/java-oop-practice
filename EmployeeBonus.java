// Q13: Create abstract Employee class to calculate bonus.

abstract class Employee {
    String name;
    int id;

    Employee(String n, int i) {
        name = n;
        id = i;
    }

    abstract double calculateBonus();
}

class Manager extends Employee {
    double salary;

    Manager(String n, int i, double s) {
        super(n,i);
        salary = s;
    }

    double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    double salary, incentive;

    Developer(String n, int i, double s, double inc) {
        super(n,i);
        salary = s;
        incentive = inc;
    }

    double calculateBonus() {
        return salary * 0.10 + incentive;
    }

    public static void main(String[] args) {
        Employee e1 = new Manager("Rahul",1,50000);
        Employee e2 = new Developer("Amit",2,40000,5000);

        System.out.println("Manager Bonus: " + e1.calculateBonus());
        System.out.println("Developer Bonus: " + e2.calculateBonus());
    }
}
