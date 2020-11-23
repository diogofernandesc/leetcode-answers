class Solution:
    def validMountainArray(self, arr: List[int]) -> bool:
        if len(arr) < 3:
            return False
        
        peak_seen = False
        for i in range(1, len(arr)):
            if arr[i-1] > arr[i]:
                if i-1 == 0:
                    return False
            
            elif arr[i-1] == arr[i]:
                return False
            
            else:
                if peak_seen:
                    return False
                
                if i == len(arr) - 1 and arr[i-1] <= arr[i]:
                    return False
                
                if not peak_seen and arr[i+1] < arr[i]:
                    peak_seen = True
        
        return True
        