package practiceDay08;

public class PrintVowelsCountInString {
	public static void main(String[] args) {
		String value = args[0]; // args[0] : Ramvilashbasvan
		char[] ch = value.toCharArray();
		int countV = 0;
		int countC = 0;
		for (int i = 0; i <= ch.length - 1; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				countV++;
			} else {
				countC++;
			}
		}
		System.out.println("Vowels count : " + countV);
		System.out.println("Consonant count : " + countC);
	}

}
