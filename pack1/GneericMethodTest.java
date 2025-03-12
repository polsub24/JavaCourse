public class GneericMethodTest {
	public static <E> void printArray(E[] inputArray) {
		//Display array elements
		for(E element:inputArray) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	public static void  main(String[] args) {
		Integer[] intArray = {1,2,3,4,5};
		Double [] doubleArray = {1.1,2.2,3.3,4.4};
		Character [] charArray = {'H','E','L','L','O'};
		System.out.println("Array integerArray conatins: ");
		printArray(intArray); // pass an Integer Array
		System.out.println("\nArray doubleArray contains: ");
		printArray(doubleArray); // pass a Double Array
		System.out.println("\nArray characterArray contains: ");
		printArray(charArray); // pass a Character Array
	}
}
