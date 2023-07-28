package practiceDay07;

public class EvenlettersPrintAnotherMethod {
	public static void main(String[] args) {
		String a = "Ramvilashbasvan";
		for (int i = 0; i < a.length(); i++) {
			if (i % 2 == 0) {                           // if odd numbers means : if(i%2 != 0)
				System.out.println(a.charAt(i));
			}

		}
	}

}
