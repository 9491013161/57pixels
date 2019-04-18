import TwoSum;
/**
 * This is Main class
 */
public class Main {
	/**
	 * This is main method
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!");
		int[] nums = {12, 2, 7, 11, 15};
		TwoSum twoSum = new TwoSum(nums, 9);
		System.out.println("Is there a result? Ans. " + twoSum.result());
	}
}