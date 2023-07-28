package PreperationQuestions;

public class PrimeNumber01 {
	public static void main(String[] args) {
		int a = 10;
		String d = "Prime";
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				d = "not Prime";
			}
		}
		System.out.println(a + " is " + d);
	}
}
