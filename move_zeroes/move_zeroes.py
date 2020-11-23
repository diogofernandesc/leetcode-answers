class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        write_pointer = 0
        for val in nums:
            if val != 0:
                nums[write_pointer] = val
                write_pointer += 1
        
        for i in range(write_pointer, len(nums)):
            nums[i] = 0
        