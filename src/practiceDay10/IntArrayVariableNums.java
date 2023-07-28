package practiceDay10;

public class IntArrayVariableNums {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		int temp = 0;
		int c = 0;
		for (int i = 0; i < nums.length; i = i + 3) {
			temp = nums[i];
			c++;
			System.out.println(temp);
		}
		System.out.println("count: " + c);
	}
}
