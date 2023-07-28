package FunLambdaExpression;

public class Addition01 {
	public static void main(String[] args) {
		Addition a = (x, y, z) -> (x + y + z);
		System.out.println(a.add(10, 20, 30));
	}

}
