package InterviewQuestions;

public class NeedtoGettheCountOfChar2 {
	public static void main(String[] args) {
		String name = "ramvilashbasvan";
		char c = 'a';
		int count = 0;
		char[] a = name.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == c) {
				count++;
			}

		}
		System.out.println(count);
	}

}
