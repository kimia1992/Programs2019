public class MergeTwoSortedArrays2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i= m-1;
        int j= n-1;
        int k= nums1.length-1;
        if(m==0)
        {
            for (int p = 0; p < nums2.length; p++)
            {
                nums1[p] = nums2[p];
            }
        }
        else if(n!=0)
        {
            while(i>=0&&j>=0)
            {
                if(nums1[i]>nums2[j])
                {
                    nums1[k]=nums1[i];
                    k--;
                    i--;
                }
                else
                {
                    nums1[k]=nums2[j];
                    k--;
                    j--;
                }
            }
            if(i>=0)
            {
                while(i>=0)
                {
                    nums1[k]=nums1[i];
                    i--;
                    k--;
                }
            }
            if(j>=0)
            {
                while(j>=0)
                {
                    nums1[k]=nums2[j];
                    j--;
                    k--;
                }
            }
        }
    }
}
