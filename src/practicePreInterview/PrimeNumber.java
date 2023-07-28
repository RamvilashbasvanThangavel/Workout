package practicePreInterview;

public class PrimeNumber {
	public static void main(String[] args) {
		int[] a = {5,10,5,2,3,6,8,21,34,45,13};
		for(int i = 0;i<a.length;i++) {
			String d="Prime";
			for(int j = 2;j<a[i];j++) {
				if(a[i]%j==0) {
					d="not Prime";
				}
				}
			System.out.println(a[i]+"-"+d);
		}
	}

}
