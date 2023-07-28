package practiceDay04;

public class North {
	public static void main(String[] args) {
		String a = args[0];
		char b = a.charAt(0);
		if (b == 'N') {
			System.out.println("North");
		} else if (b == 'S') {
			System.out.println("South");
		} else if (b == 'E') {
			System.err.println("East");
		} else {
			System.out.println("West");
		}
	}
}
