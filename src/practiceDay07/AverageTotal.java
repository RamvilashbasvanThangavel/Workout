package practiceDay07;

public class AverageTotal {
	public static void main(String[] args) {
		String[] a = args[0].split(",");
		int result1 = Integer.parseInt(a[0]);
		int result2 = Integer.parseInt(a[1]);
		int result3 = Integer.parseInt(a[2]);
		int result4 = Integer.parseInt(a[3]);
		int[] b = { result1, result2, result3, result4 };
		int total = 0;
		int count = 0;
		int Average = 0;
		for (int i = 0; i <=b.length-1; i++) {
			total = total + b[i];
			count = count + 1;
			Average = total / count;
		}
		System.out.println(Average);
	}
}