// Q7: Demonstrate abstraction using Shape class.

abstract class Shape {

    abstract double calculateArea();
}

class Circle extends Shape {

    double r = 5;

    double calculateArea() {
        return Math.PI * r * r;
    }
}

class RectangleShape extends Shape {

    int l = 4, b = 6;

    double calculateArea() {
        return l * b;
    }

    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new RectangleShape();

        System.out.println("Circle Area: " + s1.calculateArea());
        System.out.println("Rectangle Area: " + s2.calculateArea());
    }
}
