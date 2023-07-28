package practicePreInterview;

public class Fibnoccis2 {
	public static void main(String[] args) {
		int value = 10;
		int a = 0;
		int b = 1;
		int c = a + b;
		int count = 0;
		System.out.println(a);
		for (int i = 0; i <= value - 2; i++) {
			a = b;
			count = count +a;
			b = c;
			c = a + b;
			System.out.println(a);
		}
		System.out.println(count);
	}

}
