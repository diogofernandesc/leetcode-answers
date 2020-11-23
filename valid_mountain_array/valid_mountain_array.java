class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
                return false;
        }
        boolean peakSeen = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i]) {
                if (i-1 == 0) { 
                    return false;
                }
            } else if (arr[i-1] == arr[i]) {
                return false;
                
            } else {
                if (peakSeen) { 
                    return false;
                }
                
                if (i == arr.length - 1 && arr[i-1] <= arr[i]) {
                    return false;
                }
                
                 if (!peakSeen && arr[i+1] < arr[i]) {
                    peakSeen = true;
                }
                
            }
        }
        return true;
        
    }
}