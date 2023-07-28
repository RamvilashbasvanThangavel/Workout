package practiceDay06;

public class factorialData {
	public static void main(String[] args) {
		int num = 6;
		int num1 = num / 2;
		int f = 1;
		for (int i = 1; i <= num1; i++) {
			f = f * i;
		}
		System.out.println(f);
	}
}