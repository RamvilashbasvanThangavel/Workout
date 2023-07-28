package RevisionJava8Tod1;

public class NullPointWithException02Handeled {
	public static void main(String[] args) {
		String a = null;
		System.out.println("Welcome");
		try {
			String b = a.toLowerCase();
			System.out.println(b);
		} catch (ArithmeticException ae) {
			System.out.println("Ae-Error-11");
		} catch (Exception e) {
			System.out.println("E-Error-12");
		} finally {
			System.out.println("Data");
			System.out.println("Loging in");
		}
	}

}
