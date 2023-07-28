package practiceDay06;

public class RemovingNumber {
	public static void main(String[] args) {
		String word = "Ram1804";
		for (int i = 0; i <= word.length() - 1; i++) {

			if (word.charAt(i) >= 65 || word.charAt(i) <= 90 || word.charAt(i) >= 92 || word.charAt(i) <= 122) {
				continue;
			}
			System.out.println(word.charAt(i));
		}
	}
}
