package practiceDay07;

public class WordMoreThan4Digit {
	public static void main(String[] args) {
		String[] a = args[0].split(","); // args[0] = ganga,malmos,king,zoo
		String high = a[0];
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i].length() >= 4) {
				System.out.println(a[i]);
			}
		}
		for (int i = 0; i <= a.length - 1; i++) {
			if (high.length() <= a[i].length())
				high = a[i];
		}
		System.out.println("highest : "+ high.toUpperCase());
	}
}
