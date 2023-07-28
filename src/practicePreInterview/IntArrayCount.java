package practicePreInterview;

public class IntArrayCount {
	public static void main(String[] args) {
		int[] a = { 3, 4, 5, 6, 7, 8, 9};
		int res = 0, t = 1, m = 1;
//
//		for (int i = a.length - 1; i >= 0; i--) {
//			t = a[i] * m;
//			res = res + t;
//			m = m * 10;
//		}
//		System.out.println(res);
//		
		
		int total = 0;
		for(int i:a) {
			total = total*10+i;
		}
		System.out.println(total);
	}
}
