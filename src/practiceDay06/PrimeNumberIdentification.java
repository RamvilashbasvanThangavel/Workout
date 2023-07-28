package practiceDay06;

public class PrimeNumberIdentification {
	public static void main(String[] args) {
		int num = 13;
		boolean prime = true;
		for (int i = 2; i <= num; i++) {
			if (num % 2 == 0) {
				prime = false;
			}
		}
		if (prime == true) {
			System.out.println("prime");
		} else {
			System.out.println("Not prime");
		}

	}
}
