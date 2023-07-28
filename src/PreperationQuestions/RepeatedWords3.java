package PreperationQuestions;

public class RepeatedWords3 {
	// Output=m
	// Output=uy
	// Output=m=3
	public static void main(String[] args) {
		String name = "OneSoft Technologies";
		char[] c = name.toUpperCase().toCharArray();
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					System.out.println("Duplicate letters are " + c[j]);
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
