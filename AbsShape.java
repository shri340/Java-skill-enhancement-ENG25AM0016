abstract class Shape {
    abstract void calculateArea();

    void display() {
        System.out.println("Area = ");
    }
}

class Circle extends Shape {
    void calculateArea() {
        double area = 3.14 * 7 * 7;
        System.out.println("Area of Circle = " + area);
    }
}

class Rectangle extends Shape {
    void calculateArea() {
        int area = 10 * 5;
        System.out.println("Area of Rectangle = " + area);
    }
}

public class AbsShape {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.calculateArea();
        r.calculateArea();
    }
}