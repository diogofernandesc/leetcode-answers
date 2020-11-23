// This solution is O(n^2)
class Solution {
    public boolean checkIfExist(int[] arr) {
        if (arr.length == 0) {
            return false;
        }
        
        for (int i = 0 ; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j] * 2 || arr[j] == arr[i] * 2) {
                    return true;
                }
            }
        }
        
        return false;
        
    }
}
