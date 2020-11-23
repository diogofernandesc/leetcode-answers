class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        if len(arr) == 0:
            return False
        
        for idx, val in enumerate(arr):
            for j in range(idx + 1, len(arr)):
                if val == arr[j] * 2 or arr[j] == val * 2:
                    return True
                
        return False
        