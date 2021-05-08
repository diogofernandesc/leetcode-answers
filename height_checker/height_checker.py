class Solution:
    def heightChcker(self, heights: List[int]) -> int:
        expected = heights.copy()
        expected.sort()
        count = 0
        for idx, height in enumerate(heights):
            if expected[idx] != height:
                count += 1