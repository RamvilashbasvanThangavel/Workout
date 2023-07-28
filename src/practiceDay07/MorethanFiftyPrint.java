package practiceDay07;

public class MorethanFiftyPrint {
	public static void main(String[] args) {
	String[] a = args[0].split(",");              // args[0] = 2,51,5,62
	int num0 = Integer.parseInt(a[0]);
	int num1 = Integer.parseInt(a[1]);
	int num2 = Integer.parseInt(a[2]);
	int num3 = Integer.parseInt(a[3]);
	int[] numbers = {num0,num1,num2,num3};
	for (int i = 0;i <= numbers.length-1;i++) {
		if(numbers[i]>50 ) {
			System.out.println(numbers[i]);
		}
		else {
			System.out.println(numbers[i]*numbers[i]);
		}
	}
}
}
