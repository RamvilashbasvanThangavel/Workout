package day1Exam;

public class ExceptionData {
	public static void main(String[] args) throws Shyamala,Exception {
		int a = 10;
		int b = 2;
		if(a/b==5) {
			throw new Shyamala("Divisible");
		}
		else {
		   System.out.println("a was not divisible by 2 so enter correct number");
		}
	}

}
