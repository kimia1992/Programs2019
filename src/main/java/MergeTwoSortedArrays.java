import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;

        List<Integer> ls = new ArrayList<Integer>();
        if(m==0)
        {
            for (int p = 0; p < nums2.length; p++) {
                nums1[p] = nums2[p];
            }
        }
        else if(n!=0) {
            while (i < m && j < n) {
                if (nums1[i] < nums2[j]) {
                    ls.add(nums1[i]);
                    i++;

                } else if (nums1[i] == nums2[j]) {
                    ls.add(nums1[i]);
                    ls.add(nums2[j]);
                    i++;
                    j++;
                } else if (nums1[i] > nums2[j]) {
                    ls.add(nums2[j]);
                    j++;
                }
            }
            if (i < m ) {
                while (i < m) {
                    ls.add(nums1[i]);
                    i++;
                }
            }
            if (j < n) {
                while (j < n) {
                    ls.add(nums2[j]);
                    j++;
                }
            }
            for (int k = 0; k < nums1.length; k++) {
                nums1[k] = ls.get(k);
            }
        }


    }
}
