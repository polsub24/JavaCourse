package da3;
import java.util.*;
public class DaysOfMonth {
	void validMonth(int n) throws ArrayIndexOutOfBoundsException{
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (n>0 && n<=12){
			System.out.println("Month = "+ months[n-1]+"; Days = "+ dom[n-1]);
		}
		else {
			throw new ArrayIndexOutOfBoundsException("wrong number");
		}
	}
	public static void main(String[] args) {
			Scanner obj = new Scanner(System.in);
			System.out.print("Enter a number : ");
			int n = obj.nextInt();
		try{
			DaysOfMonth ob = new DaysOfMonth();
			ob.validMonth(n);
		}
		catch (ArrayIndexOutOfBoundsException s){
			System.out.println(s);
		}
	}
}
