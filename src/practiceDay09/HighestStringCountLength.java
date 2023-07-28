package practiceDay09;

public class HighestStringCountLength {
	public static void main(String[] args) {
		String[] ab = { "Ram", "Balaji", "Kavi" };
		int max = 0;
		String temp = "";
		for (int i = 0; i < ab.length; i++) {
			if (ab[i].length() > max) {
				temp = ab[i].toUpperCase();
				max = ab[i].length();
			}
		}
		System.out.println("Maximum Length of String In Word = " + temp.toUpperCase());
		System.out.println("Maximum Length of String = " + max);
	}
}
