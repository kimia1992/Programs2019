//https://leetcode.com/problems/find-peak-element/
//https://www.youtube.com/watch?v=a7D77DdhlFc
public class Peak {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)
            return 0;
        int peak=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                if(nums[i]>nums[i+1])
                {
                    peak=i;
                    break;
                }
            }
            else if(i==nums.length-1)
            {
                if(nums[i]>nums[i-1])
                {
                    peak=i;
                    break;
                }
            }
            else if(nums[i]>nums[i-1]&&nums[i]>nums[i+1])
            {
                peak=i;
                break;
            }
        }
        return peak;
    }
}
