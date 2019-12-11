//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
//https://www.youtube.com/watch?v=zIHe2V5Py3U
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        int index=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                nums[index]=nums[i+1];
                index++;
            }
        }
        return index;

    }
}
