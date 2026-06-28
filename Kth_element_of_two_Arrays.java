class Solution {
    public int kthElement(int nums1[], int nums2[], int k) {
        int len1 = nums1.length, len2 = nums2.length;
        if (len1 > len2)
            return kthElement(nums2,nums1,k);
        
        int low = Math.max(0,k-len2), high = Math.min(k,len1);

        while (low <= high) {
            int cut1 = (low + high) / 2;
            int cut2 = k - cut1;
            int l1 = cut1 > 0 ? nums1[cut1-1] : Integer.MIN_VALUE;
            int l2 = cut2 > 0 ? nums2[cut2-1] : Integer.MIN_VALUE;
            int r1 = cut1 < len1 ? nums1[cut1] : Integer.MAX_VALUE;
            int r2 = cut2 < len2 ? nums2[cut2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1,l2);
            }

            else if (l1 > r2) high = cut1-1;
            else low = cut1+1;
        }

        return 0;
    }
}

/*
    Time Complexity : O(log min(m,n))
    Space Complexity: O(1)
*/