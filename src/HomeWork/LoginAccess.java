package HomeWork;

public class LoginAccess {
	public static void main(String[] args) {
		String a = "Enter your user id";
		String b = "aA1.";
		char[] c = b.toCharArray();
		System.out.println(a);
		System.out.println("Enter");
		for (int i = 0; i < c.length; i++) {
		if ( c[i]== 65 &&
				
				c[i] == 92 && c[i] == 105 && c[i] == 122 && c[i] == 32
				&& c[i] == 64) {
			System.out.println("ok wait");
		} else {
			System.out.println("Enter the special Char");
		}
	}

}
}
		