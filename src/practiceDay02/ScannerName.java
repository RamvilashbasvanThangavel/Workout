package practiceDay02;

import java.util.Scanner;

public class ScannerName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("choose a name");
		String name = sc.nextLine();
		System.out.println("choose a password");
		int password = sc.nextInt();
		System.out.println("your name is:" + name + "\n" + "Your Password is" + password);

	}

}
