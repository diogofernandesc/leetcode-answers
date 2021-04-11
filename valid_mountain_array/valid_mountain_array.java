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

class Solution2 {
    public boolean validMountainArray(int[] arr) {
        Integer peakIndex = null;
        boolean climbed = false;
        boolean descended = false;
        if (arr.length < 3) {
            return false;
        }

        for (int i = 0 ; i < arr.length; i++) {
            if (i + 1 < arr.length) {
                if (arr[i] < arr[i+1]) {
                    climbed = true;
                }
                if (peakIndex != null) {
                    return false;
                }
            } else {
                descended = true;
                if (peakIndex == null ) {
                    peakIndex = i;
                }
                if (peakIndex != null && i < peakIndex) {
                    return false;
                }
                if (peakIndex != null && arr[i] == arr[i+1]) {
                    return false;
                }
            }
        }
        if (peakIndex == null || !climbed || !descended) {
            return false;
        }
        return true;
    }
}

class OptimalSolution {
    // from leetcode
    public boolean validMountainArray(int[] A) {
            int N = A.length;
            int i = 0;

            // walk up
            while (i+1 < N && A[i] < A[i+1])
                i++;

            // peak can't be first or last
            if (i == 0 || i == N-1)
                return false;

            // walk down
            while (i+1 < N && A[i] > A[i+1])
                i++;

            return i == N-1;
        }
    
}

