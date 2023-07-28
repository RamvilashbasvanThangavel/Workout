package practiceDay02;

import java.util.Scanner;

public class ScannerData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		int b = sc2.nextInt();
		int multiple = a * b;
		System.out.println(multiple);
	}

}
