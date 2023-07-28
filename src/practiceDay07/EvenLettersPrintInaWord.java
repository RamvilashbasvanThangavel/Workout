package practiceDay07;

public class EvenLettersPrintInaWord {
	public static void main(String[] args) {
		String a = "Ramvilashbasvan";
		for (int i = 1; i <= a.length() - 1; i = i + 2) {
			System.out.println(a.charAt(i));
		}

	}
}
