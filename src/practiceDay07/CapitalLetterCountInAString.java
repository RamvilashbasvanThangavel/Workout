package practiceDay07;

public class CapitalLetterCountInAString {
	public static void main(String[] args) {
		String mail = "RvbRamVi298";
		char[] a = mail.toCharArray();
		int uc = 0; // uppercasecount temp
		int lc = 0; // lowercasecount temp
		int nc = 0; // Numberscount temp
		for (int i = 0; i < mail.length(); i++) {
			if (a[i] >= 'A' && a[i] <= 'Z') {
				uc++;
			} else if (a[i] >= 'a' && a[i] <= 'z') {
				lc++;
			} else if (a[i] >= '0' && a[i] <= '9') {
				nc++;
			}
		}
		System.out.println("UC : " + uc);
		System.out.println("LC : " + lc);
		System.out.println("NC : " + nc);
	}

}
