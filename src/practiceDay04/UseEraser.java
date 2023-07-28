package practiceDay04;

public class UseEraser {
	public static void main(String[] args) {
		Eraser eraser = new Eraser();
		String[] a = args[0].split(",");
		eraser.brand = a[0].toUpperCase();
		int b = a[0].length();
		char d = a[0].charAt(a[0].length() - 1);
		char c = (eraser.brand).charAt(1);
		eraser.price = Integer.parseInt(a[1]);
		eraser.isquality = Boolean.parseBoolean(a[2]);
		System.out.println("Brand - " + eraser.brand + ", " + "Price - " + eraser.price + ", " + "Quality - "
				+ eraser.isquality + ", " + "Length - " + b + ", " + "SecondLetter - " + c);
		System.out.println("last letter of " + d);
	}

}
