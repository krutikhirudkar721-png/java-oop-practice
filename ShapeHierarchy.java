// Q11: Demonstrate hierarchical inheritance (Shape -> Circle, Rectangle).

class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double r = 5;
    void area() {
        System.out.println("Circle Area: " + (Math.PI * r * r));
    }
}

class RectangleShape extends Shape {
    int l = 4, b = 6;
    void area() {
        System.out.println("Rectangle Area: " + (l * b));
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        RectangleShape r = new RectangleShape();

        c.display();
        c.area();

        r.display();
        r.area();
    }
}