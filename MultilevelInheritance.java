// Q14: Demonstrate multilevel inheritance.

class Person {
    void role() {
        System.out.println("I am a person");
    }
}

class Employee extends Person {
    void role() {
        System.out.println("I am an employee");
    }
}

class Manager extends Employee {
    void role() {
        System.out.println("I am a manager");
    }

    public static void main(String[] args) {
        Person p = new Person();
        Employee e = new Employee();
        Manager m = new Manager();

        p.role();
        e.role();
        m.role();
    }
}
