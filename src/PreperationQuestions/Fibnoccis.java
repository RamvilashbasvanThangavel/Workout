package PreperationQuestions;

public class Fibnoccis {
	public static void main(String[] args) {
		int value = 10;
		int a = 0;
		int b = 1;
		int c = a + b;
		int d = 0;
		System.out.println(a);
		for (int i = 0; i <= value - 2; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(a);
		}
	}

}
