public TwoSum {

private int[] mNums;

private int mTarget;

public TwoSum(int[] nums, int trgt) {
	mNums = nums;
	mTarget = trgt;
}

public boolean result() {
	try {
		int[] nums = twoSum();
		return true;
	} catch (IllegalArgumentException e) {
		return false;
	}
	return false;
}

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