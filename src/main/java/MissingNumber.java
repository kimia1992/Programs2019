import java.util.Arrays;

//https://www.youtube.com/watch?v=Dq0jQX3YNKg
//https://leetcode.com/problems/missing-number/
public class MissingNumber {
    public int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        int arrayXor=nums[0];
//
//        for(int i=1;i<nums.length;i++)
//        {
//            arrayXor=arrayXor^nums[i];
//        }
//
//        int requiredXor=nums[0];
//        for(int j=nums[1];j<=nums[nums.length-1];j++)
//        {
//            requiredXor=requiredXor^j;
//        }
//        return arrayXor^requiredXor;
        int n=nums.length;
        int missingNumber = n;
        for(int i=0;i<nums.length;i++)
        {
            missingNumber= i^nums[i]^missingNumber;
        }
        return missingNumber;


    }
}
