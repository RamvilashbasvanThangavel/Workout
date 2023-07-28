package practiceDay08;

public class EvenNumberOneIntValue {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		for(int i = 1;i<=num;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			
		}
	}

}
