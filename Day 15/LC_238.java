class LC_238 {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;

        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                product *= num;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 1) {
                nums[i] = 0;
            } else if (zeroCount == 1) {
                nums[i] = (nums[i] == 0) ? product : 0;
            } else {
                nums[i] = product / nums[i];
            }
        }

        return nums;
    }
}
