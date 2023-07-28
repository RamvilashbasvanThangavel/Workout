package practiceDay07;

public class CountOfEvenNumbers {
	public static void main(String[] args) {
		String[] a = args[0].split(",");              // args[0] = 2,7,4,3
		int num0 = Integer.parseInt(a[0]);
		int num1 = Integer.parseInt(a[1]);
		int num2 = Integer.parseInt(a[2]);
		int num3 = Integer.parseInt(a[3]);
		int[] numbers = {num0,num1,num2,num3};
		int oc = 0;                                     // odd count indication
		int ec = 0;                                     // even count indication
		for (int i = 0;i <= numbers.length-1;i++) {
			if(numbers[i]%2==0) {
				oc++;                                
			}
			else {
				ec++;
			}
		}
		System.out.println("odd count="+oc);
		System.out.println("even count="+ec);
	}
}
