package practiceDay01;

public class ArithmeticOperators {
	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		float c = 2.56f;
		long d = 123456789101112l;
		double e = 1234578964312.256d;
		int add = a+b;
		int sub = b-a;
		int modulus = b%a;
		int multiple = a*b;
		float divide = b/c;
		double multiple1 = d*e;
		System.out.println("Addtion (A+B) - "+add + "\n"+
		"Subraction (B-A) - "+sub + "\n"+
		"Modulus (B%A) - "+modulus + "\n"+
		"Multipilication (A*B) - "+multiple + "\n"+
		"Division (B/C) - "+divide + "\n"+
		"Multiple Decimal Point (D*E) - "+multiple1);
		
	}

}
