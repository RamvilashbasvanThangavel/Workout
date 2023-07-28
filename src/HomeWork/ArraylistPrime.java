package HomeWork;

import java.util.ArrayList;

public class ArraylistPrime {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		int e = Integer.parseInt(args[4]);

		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(a);
		nums.add(b);
		nums.add(c);
		nums.add(d);
		nums.add(e);
		int p = 0;
		int np = 0;
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) % 2 == 0 || nums.get(i) % 3 == 0) {
				np = nums.get(i);
				System.out.println(np + "Not Prime");
			} else {
				p = nums.get(i);
				System.out.println(p + "Prime");
			}
		}

	}

}
