package practiceDay06;

public class MultipletheValues {
	public static void main(String[] args) {
		int num = 4;
		int total = 0;
		int multiple = 1;
		for (int i = 1; i <= num; i++) {
			total = total + i;
			multiple = total * multiple;
		}
		System.out.println("Output is " + multiple);
	}
}

//  eg value (1)*(1+2)*(1+2+3)*(1+2+3+4)=180
//		input : 3 and output :18  