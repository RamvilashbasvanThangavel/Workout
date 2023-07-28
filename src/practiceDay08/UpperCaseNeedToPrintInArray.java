package practiceDay08;

public class UpperCaseNeedToPrintInArray {
	public static void main(String[] args) {
		String[] a = args[0].split(",");              // args[0] : JAYA,raja,BELL,markantony
		for(int i = 0;i<=a.length-1;i++) {
			if(a[i].equals(a[i].toUpperCase())) {
				System.out.println(a[i]);
			}
		}
	}

}
