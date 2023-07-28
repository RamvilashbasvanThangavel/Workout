package practiceDay07;

public class VowelsOnesoft {
	public static void main(String[] args) {
		String value = args[0];                           // args[0] = onesoft;
		int count = 0;
		for (int i = 0; i <= value.length() - 1; i++) {
			char c = value.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
		}
		System.out.println(count);
	}
}
