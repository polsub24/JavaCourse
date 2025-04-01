package da4;
import java.util.Scanner;
class Box<T1, T2> {
	private T1 value1;
	private T2 value2;
	public Box(T1 value1, T2 value2) {
		this.value1 = value1;
		this.value2 = value2;
	}
	public <T> String Show(T1 a, T2 b) {
		return a + " " + b;
	}
}
public class GenericBoxTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Object1");
		System.out.println("Enter integer data 1 ");
		int int1 = scanner.nextInt();
		System.out.println("Enter integer data 2 ");
		int int2 = scanner.nextInt();
		Box<Integer, Integer> box1 = new Box<>(int1, int2);
		System.out.println("Object2");
		System.out.println("Enter double data 1 ");
		double double1 = scanner.nextDouble();
		System.out.println("Enter double data 2 ");
		double double2 = scanner.nextDouble();
		Box<Double, Double> box2 = new Box<>(double1, double2);
		System.out.println("Object1 data: " + box1.Show(int1, int2));
		System.out.println("Object2 data: " + box2.Show(double1, double2));
	}
}
