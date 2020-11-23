class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        m = m - 1
        n = n - 1
        active_index = len(nums1) - 1
        while (n >= 0):
            if m < 0 or nums1[m] <= nums2[n]:
                nums1[active_index] = nums2[n]
                n -= 1
            
            else:
                nums1[active_index] = nums1[m]
                m -= 1
            
            active_index -= 1
        