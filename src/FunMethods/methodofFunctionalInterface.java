package FunMethods;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface methodofFunctionalInterface {
	public static void main(String[] args) {
		Function<Integer, String> f = (x) -> "01-The output is " + x;
		Supplier<String> s = () -> "02-Output given By Ram";
		Consumer<String> c = (x) -> System.out.println("Ram" + x);
		Predicate<String> b = x -> x.equals("Ram");

		System.out.println(f.apply(500));
		System.out.println(s.get());
		c.accept("vilash");
		System.out.println(b.test("Ram"));

	}

}
