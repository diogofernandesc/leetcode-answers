class Solution:
    def sortedSquares(self, A: List[int]) -> List[int]:
        new_arr = [x for x in range(0, len(A))]
        n = len(A)
        left = 0
        right = len(A) - 1

        for i in range(n - 1, -1, -1):
            if abs(A[left]) > abs(A[right]):
                new_arr[i] = A[left] ** 2
                left += 1
            else:
                new_arr[i] = A[right] ** 2
                right -= 1

        return new_arr
