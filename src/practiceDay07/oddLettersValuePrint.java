package practiceDay07;

public class oddLettersValuePrint {
	public static void main(String[] args) {
		String a = "Ramvilashbasvan";
		char[] b = a.toCharArray();
		for (int i = 0; i <= a.length() - 1; i = i + 2) {
			System.out.println(a.charAt(i));
		}

	}
}
