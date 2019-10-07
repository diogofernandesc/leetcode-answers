from typing import List


class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        k = 0
        for i in range(0, len(nums)):
            if nums[i] != val:
                k += 1
                nums[k] = nums[i]
                k += 1

        return k

# Alternatively, iterate and nums.remove() on the value we don't want