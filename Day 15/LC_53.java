public class LC_53 {
    public int maxSubArray(int[] nums) {
        int c=nums[0];
        int m=nums[0];
        for(int i=1;i<nums.length;i++){
            c=Math.max(nums[i],c+nums[i]);
            m=Math.max(m,c);
        }
        return m;
    }
}
