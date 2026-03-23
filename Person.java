// Q1: Write a Java program to create a Person class using a constructor
// to initialize name and age and display the details.

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Rahul", 20);
        Person p2 = new Person("Amit", 25);

        p1.display();
        p2.display();
    }
}
