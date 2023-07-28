package PreperationQuestions;

public class a3b2c401 {
	public static void main(String[] args) {

		String word = "a3b2d4";
		String t1 = "",t2="";
		for (int i = 0; i < word.length(); i++) {
			if (i % 2 == 0) {
				t1=t1+word.charAt(i);
			} else{
				t2=t2+word.charAt(i);
				System.out.println(t2);
				for (int j = 0; j <i ; j++) {
					//System.out.print(word.charAt(i-1));
				}
			}
		}
	}
}
