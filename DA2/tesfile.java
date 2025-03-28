package da3;
import java.util.Scanner;
class GeometricObject {
	private String color;
	private boolean filled;
	public GeometricObject() {
    this.color = "blue";
    this.filled = false;
}
public void getColor() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter color: ");
    this.color = sc.nextLine();
}
public void getFilled() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Is the object filled? (true/false): ");
    this.filled = sc.nextBoolean();
}
public String getColorValue() {
    return color;
}

public boolean isFilled() {
    return filled;
	}
}
class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;


    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public static double getdata1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1: ");
        return sc.nextDouble();
    }

    public static double getdata2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side2: ");
        return sc.nextDouble();
    }

    public static double getdata3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side3: ");
        return sc.nextDouble();
    }
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
    }
}
public class testfile {
    public static void main(String[] args) {
        // Taking user input for sides
        double s1 = Triangle.getdata1();
        double s2 = Triangle.getdata2();
        double s3 = Triangle.getdata3();

        // Creating Triangle object
        Triangle triangle = new Triangle(s1, s2, s3);

        // Getting color and filled status
        triangle.getColor();
        triangle.getFilled();

        // Displaying details
        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColorValue());
        System.out.println("Filled: " + triangle.isFilled());
    }
}
