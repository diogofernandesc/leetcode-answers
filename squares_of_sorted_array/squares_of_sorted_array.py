class Solution:
    def sortedSquares(self, A: List[int]) -> List[int]:
        A = [x**2 for x in A]
        return sorted(A)
