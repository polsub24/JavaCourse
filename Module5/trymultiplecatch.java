public class trymultiplecatch {
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
		System.out.println("rest of the code");
	}
}
