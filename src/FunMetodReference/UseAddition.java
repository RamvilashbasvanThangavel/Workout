package FunMetodReference;

public class UseAddition {
	public static void main(String[] args) {
		Sample val = new Sample();
		Addition a = val::data;
		System.out.println(a.add(10, 20));
	}

}
