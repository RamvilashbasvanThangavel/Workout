package practiceDay06;

public class Add6 {
	public static void main(String[] args) {
		int num = 4;
		int total = 0;
		for (int i = 1; i <= num; i = i + 6) {
			total = total + i;
		}
		System.out.println(total);
	}
}
