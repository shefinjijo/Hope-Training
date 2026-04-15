import java.util.HashMap;
import java.util.Map;

public class LC_1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int i,diff;
        for( i=0;i<nums.length;i++){
           diff=target-nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
