class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        highest_val = arr[-1];
        for i in range(len(arr)-2, -1, -1):
            if arr[i+1] > highest_val:
                highest_val = arr[i+1]
            
            if arr[i] > highest_val:
                temp_val = arr[i]
                arr[i] = highest_val
                highest_val = temp_val
        
            else:
                arr[i] = highest_val
        
        arr[-1] = -1
        return arr