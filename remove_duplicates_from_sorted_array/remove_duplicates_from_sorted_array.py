class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        length = 0
        for idx, val in enumerate(nums):
            if idx == 0 or val != nums[idx-1]:
                nums[length] = val
                length += 1
        
        return length
        