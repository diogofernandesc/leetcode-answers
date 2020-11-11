class Solution:
    def duplicateZeros(self, arr: List[int]) -> None:
        """
        Do not return anything, modify arr in-place instead.
        """
        i = 0
        while(i < len(arr)):
            if arr[i] == 0:
                # Shift elements to the right
                for j in range(len(arr) - 1, i, -1):
                    arr[j] = arr[j-1]

                if i + 1 < len(arr):
                    arr[i+1] = 0

                i += 1
            i += 1
