package practiceDay10;

public class Laptop {
	String brand;
	String color;
	int price;
	boolean emi;

	public int total(int a, int b, int c) {
		return a + b + c;
	}

	public void hp(Laptop[] data) {
		Laptop max = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i].price > max.price) {
				max = data[i];
			}
		}
		System.out.println("Laptop Brand =" + max.brand + ", Laptop color =" + max.color + ", Laptop Price ="
				+ max.price + ", Laptop emi =" + max.emi);
	}

	public void ab3(Laptop[] b) {
		for (int i = 0; i < b.length; i++) {
			if (b[i].price > 30000) {
				System.out.println("Laptop Brand =" + b[i].brand + ", Laptop color =" + b[i].color);
			}
		}

	}
}
