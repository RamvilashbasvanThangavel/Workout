package InterviewQuestions;

public class NeedtoGettheCountOfChar {
	public int gt(String name, char c) {
		int count = 0;
		char[] a = name.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == c) {
				count++;
			}

		}
		return count;

	}

	public static void main(String[] args) {
		String name = "ramvilashbasvan";
		char c = 'a';
		NeedtoGettheCountOfChar s = new NeedtoGettheCountOfChar();
		System.out.println(s.gt(name, c));

	}

}
