from typing import List


class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        consecutive_count = 0
        tmp = 0
        for i in range(0, len(nums)):
            if nums[i] == 1:
                tmp += 1

            else:
                tmp = 0

            if tmp > consecutive_count:
                consecutive_count = tmp

        return consecutive_count
