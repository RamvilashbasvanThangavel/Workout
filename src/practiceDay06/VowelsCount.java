package practiceDay06;

public class VowelsCount {
	public static void main(String[] args) {
		String word = "RamvilashBasvan";
		String a = word.toUpperCase();
		int vowels = 0;
		int cons = 0;
		for (int i = 0; i <= a.length() - 1; i++) {
			if (a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I' || a.charAt(i) == 'O'
					|| a.charAt(i) == 'U') {
				vowels++;
				System.out.println("vowels : " + vowels);
			} else {
				cons++;
			}
		}
		System.out.println("vowels : " + vowels);
		System.out.println("consanant is " + cons);
	}
}
