package practiceDay07;

public class EvenNumberPrint {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);  // args[] = 5
		for(int i = 1;i <= a;i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}

}
