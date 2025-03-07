public class Throw {
	static void validateMarks(int marks) {
		if (marks<80) {
			throw new ArithmeticException("Not Oracle certified");
		}
		else {
			System.out.println("Oracle certified");
		}
	}
	public static void main(String[] args) {
		try {
			validateMarks(75);
		}
		catch(ArithmeticException obj) {
			System.out.println(obj);
		}
		System.out.println("welcome ...");
	}
}
