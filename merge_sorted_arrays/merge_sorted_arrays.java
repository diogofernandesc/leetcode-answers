class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m = m - 1;
        n = n - 1;
                                
        int activeIndex = nums1.length - 1;
        while (n >= 0) {
            if (m < 0 || nums1[m] <= nums2[n]) {
                nums1[activeIndex] = nums2[n];
                n--;

            } else {
                nums1[activeIndex] = nums1[m];
                m--;
            }

            activeIndex--;
        }

        
    }
}

// Basic principle is about using the two pointers given to us at the beginning
// Comparing the pointer values until n is exhausted (as this is the pointer for the list that needs to be transferred) 