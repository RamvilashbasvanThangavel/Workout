package practiceDay06;

public class capitalLetters {
	public static void main(String[] args) {
		String word = "RamVILAShbasvAN";
		int count = 0;
		for (int i = 0; i <= word.length() - 1; i++) {
			if (word.charAt(i) >= 65 && word.charAt(i) <= 90) {
				count++;
			}
		}
		System.out.println(count);
	}

}
