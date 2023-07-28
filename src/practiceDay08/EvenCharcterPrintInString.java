package practiceDay08;

public class EvenCharcterPrintInString {
	public static void main(String[] args) {
		String a = "RamVilash";
	char[] ch = a.toCharArray();
	for(int i = 0;i<=ch.length-1;i++) {
		if(i%2!=0) {
			System.out.println(ch[i]);
		}
	}
	}

}
