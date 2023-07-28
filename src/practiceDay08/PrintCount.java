package practiceDay08;

public class PrintCount {
	public static void main(String[] args) {
		String values = "aaaBBBBCCCddd";
		String ab = values.toLowerCase();
		char[] ac = ab.toCharArray();
		int count = 1;
		char ch = ' ';
		for (int i = 0; i < ac.length; i++) {
			if (ac[i] != ch) {
				ch = ac[i];
				for (int j = i + 1; j < ac.length; j++) {
					if (ac[i] == ac[j]) {
						count++;
					}
				}
				System.out.println(ac[i] + " is repeated " + count);
				count = 1;

			}
		}

	}

}
