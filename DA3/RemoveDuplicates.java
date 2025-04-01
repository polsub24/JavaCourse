
package da4;
import java.util.*;
public class RemoveDuplicates {
    public static void removeDuplicate(ArrayList<Integer> list) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }
        removeDuplicate(list);
        System.out.print("Distinct integers: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
