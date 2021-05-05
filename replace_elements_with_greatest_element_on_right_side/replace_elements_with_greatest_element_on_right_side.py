class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        highest_val = arr[-1];
        for i in range(len(arr)-2, -1, -1):
            tmp_val = arr[i]
            arr[i] = highest_val
            if (tmp_val > highest_val):
                highest_val = tmp_val
            
        arr[-1] = -1
        return arr