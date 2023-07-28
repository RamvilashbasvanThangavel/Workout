package practiceDay06;

public class Fibnoccis {
	public static void main(String[] args) {
		int value = 10;
		int a = 0;
		int b = 1;
		int c = a+b;
		System.out.println(a);
		for (int i = 0; i <= value; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(a);

		}
	}

}
