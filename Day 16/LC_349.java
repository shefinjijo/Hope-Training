import java.util.HashSet;
import java.util.Set;

public class LC_349 {
     public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res=new HashSet<>();
        Set<Integer> set1=new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            if(set1.contains(num)){
                res.add(num);
            }
        }
        int[] arr=new int[res.size()];
        int i=0;
        for(int num:res){
            arr[i]=num;
            i++;
        }
        return arr;
    }
}
