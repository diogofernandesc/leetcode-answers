class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        count = 0
        highest_count = nums[0]
        for val in nums:
            if val == 1:
                count += 1
            
            else:
                count = 0
                
            if count > highest_count:
                highest_count = count
        
        return highest_count
                
        