from typing import List


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums = sorted(nums)
        total = 0
        for i in range(0, len(nums) - 1, 2):
            total += nums[i]
        return total

# Alternatively, beautiful python -> sum(sorted(nums)[::2]
