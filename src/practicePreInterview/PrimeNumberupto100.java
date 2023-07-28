
package practicePreInterview;

public class PrimeNumberupto100 {
	public static void main(String[] args) {
		int a = 100;
		int j;
		for (int i = 1; i <= a; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (i == j)
				System.out.println(i);
		}
	}
}
