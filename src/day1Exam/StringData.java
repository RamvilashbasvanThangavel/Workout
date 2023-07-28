package day1Exam;

public class StringData {
	public static void main(String[] args) {
		System.out.println("Welcome");
		System.out.println("Hai");
		System.out.println("Where r u");
		System.out.println("What is ur name");
		String a = "Ramvilash";
		try {
			String b = a.substring(0, 13);
			System.out.println(b);
		} catch (StringIndexOutOfBoundsException ste) {
			System.out.println("str error");
		} catch (ArithmeticException ae) {
			System.out.println("Ae error");
		} finally {
			System.out.println("Tell your name");
			System.out.println("Ok meet u in office");
		}
	}

}
