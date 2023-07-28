package practiceDay10;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.brand = "Dell";
		l1.price = 100000;
		l1.color = "Silver";
		l1.emi = true;
		
		Laptop l2 = new Laptop();
		l2.brand = "Hp";
		l2.price = 70000;
		l2.color = "Black";
		l2.emi = true;
		
		Laptop l3 = new Laptop();
		l3.brand = "Asus";
		l3.price = 75000;
		l3.color = "White";
		l3.emi = false;
		
		Laptop[] laptops = {l1,l2,l3};
		System.out.println("Net Price of All Laptops ="+l1.total(l1.price,l2.price,l3.price));   // ReturnParameter Type
		l1.hp(laptops);      // void Parameter
		l1.ab3(laptops);     // void parameter
		
	}

}
