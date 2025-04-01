package da4;
import java.util.ArrayList;
import java.util.Scanner;
public class SumArrayList {
    public static double sum(ArrayList<Double> list) {
        double total = 0;
        for (double num : list) {
            total += num;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();
        
        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            numbers.add(scanner.nextDouble());
        }
        System.out.println("The sum of the numbers is: " + sum(numbers));
    }
}
