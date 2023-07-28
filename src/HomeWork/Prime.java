package HomeWork;

public class Prime {
	public static void main(String[] args) {
		int a=5;
		String b = "Prime";
		for(int i = 2;i<a;i++) {
			if(a%2==0) {
			b = "Not Prime";
		}
		}
		System.out.println(a+"-"+b);
		
}
}