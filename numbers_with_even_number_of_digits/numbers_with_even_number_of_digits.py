class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        even_count = 0
        for num in nums:
            length = len(str(num))
            if length % 2 == 0:
                even_count += 1

        return even_count


