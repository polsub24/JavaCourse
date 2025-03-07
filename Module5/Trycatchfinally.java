public class Trycatchfinally {
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
			System.out.println(5/0);
		}
		catch (NullPointerException obj) {
			System.out.println("arithmetic exception handled");
			System.out.println(obj);
		}
		catch (Exception obj) {
			System.out.println("arithmetic exception handled");
			System.out.println(obj);
		}
		finally {//always executed irrespective of exception handled or not above
      // finally alone can't be written with try compulsory
			System.out.println("finally always executed");
		}
		System.out.println("rest of the code");
	}
}
