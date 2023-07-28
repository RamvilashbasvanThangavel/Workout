package practiceDay08;

public class WordMoreThan6WithUpperCase {
public static void main(String[] args) {
	String[] a = args[0].split(",");
	for(int i = 0;i<a.length;i++) {
		if(a[i].length()> 6) {
			System.out.println(a[i].toUpperCase());
		}
	}
}
}
