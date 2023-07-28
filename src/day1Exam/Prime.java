package day1Exam;

public class Prime {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		boolean prime=true;
		for(int i = 2;i<a;i++) {
			if(prime==false) {;
			break;
		}
		}
			if(prime==true) {
				System.out.println(a+"-"+"Prime");
			}
			else {
				System.out.println(a+"-"+"Not Prime");
			}
	}
	}


