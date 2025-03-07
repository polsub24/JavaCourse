import java.util.Scanner;
public class IAEmanualuse {
	void validateAge(int age) throws InvalidAgeException{
		if (age<=100 && age>0) {
			System.out.println("Valid age");
		}
		else {
			throw new InvalidAgeException("Age is not vaid");
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age ");
		int age = sc.nextInt();
		IAEmanualuse ck = new IAEmanualuse();
		try {
			ck.validateAge(age);
		}
		catch(InvalidAgeException e){
			System.out.println(e);
		}
	}
}
