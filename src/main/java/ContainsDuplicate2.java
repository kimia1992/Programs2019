//https://leetcode.com/problems/contains-duplicate-ii/
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k)
    {
        Set<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<nums.length;++i)
        {
            if(hs.contains(nums[i]))
            {
                return true;
            }
            hs.add(nums[i]);
            if(hs.size()>k)
            {
                hs.remove(nums[i-k]);
            }
        }
        return false;

    }
}
