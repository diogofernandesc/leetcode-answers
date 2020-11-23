class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        length = 0
        for idx, item in enumerate(nums):
            if item != val:
                nums[length] = item
                length += 1
                
        return length
        