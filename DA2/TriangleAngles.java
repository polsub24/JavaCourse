import java.util.Scanner;

public class TriangleAngles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the three points
        System.out.print("Enter x1, y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2, y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.print("Enter x3, y3: ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        // Calculate the sides of the triangle
        double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        // Calculate the angles using the law of cosines
        double angleA = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c)));
        double angleB = Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c)));
        double angleC = Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));

        // Display the angles
        System.out.printf("Angle A: %.2f degrees\n", angleA);
        System.out.printf("Angle B: %.2f degrees\n", angleB);
        System.out.printf("Angle C: %.2f degrees\n", angleC);

    }
}
