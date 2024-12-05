
import java.util.Scanner;

abstract class Shape{
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    double calculateArea(){
        return Math.PI*radius*radius;
    }

    double calculatePerimeter(){
        return 2*Math.PI*radius;
    }
}

class Triangle extends Shape {
    private double s1, s2, s3;
    public Triangle(double s1, double s2, double s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    double calculateArea(){
        double s = (s1 + s2 + s3) / 2;
        return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    }

    double calculatePerimeter(){
        return s1 + s2 + s3;
    }
}

public class prgm6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        int r = sc.nextInt();
        Shape circle = new Circle(r);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        System.out.println("Enter the sides of the triangle: ");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        Shape triangle = new Triangle(s1, s2, s3);
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
    }
}