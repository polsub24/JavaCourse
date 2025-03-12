import java.util.ArrayList;
public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<String>();
		cityList.add("London");
		System.out.println(cityList);
		cityList.add("Denver");
		System.out.println(cityList);
		cityList.add("Paris");
		System.out.println(cityList);
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList.add(40);
		System.out.println(intList);
	}
}
