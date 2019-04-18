/**
 * This is a Two Sum class. This class accepts a numbers array and a target number.
 * This class calculates if the target number can be formed by adding 2 numbers present in the array.
 */
public TwoSum {
/**
 * Integer array to hold the numbers.
 */
private int[] mNums;
/**
 * This is an integer that holds the target number.
 */
private int mTarget;

/**
 * Constructor
 * @param nums number array
 * @param trgt the target number
 */
public TwoSum(int[] nums, int trgt) {
	mNums = nums;
	mTarget = trgt;
}

/**
 * This method returns if the array contains 2 numbers that add up to the given target
 * returns a boolean True 
 */
public boolean result() {
	try {
		int[] nums = twoSum();
		return true;
	} catch (IllegalArgumentException e) {
		return false;
	}
	return false;
}

/**
 * This method returns an integer array with the indices of the input that add up to the target.
 * If no solution exists, this method throws {IllegalArgumentException} exception.
 */
public int[] twoSum() {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] solution = new int[2];
        for(int i=0; i<mNums.length; i++) {
            int complement = mTarget - mNums[i];
            if(map.containsKey(complement)) {
                return new int[] {i, map.get(complement)};
            }
               map.put(mNums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}