package practiceDay09;

public class IndexPositionOfAlphabet {
	public static void main(String[] args) {
		String value = "abd123";
		for (int i = 0; i <= value.length() - 1; i++) {
			char c = value.charAt(i);
			if (c >= 'a' && c <= 'z') {
				System.out.println("Index position of" + c + " is " + i);

			}
		}
	}
}
