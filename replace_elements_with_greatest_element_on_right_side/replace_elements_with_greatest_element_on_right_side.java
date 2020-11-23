class Solution {
    public int[] replaceElements(int[] arr) {
        int highestVal = arr[arr.length-1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i+1] > highestVal) {
                highestVal = arr[i+1];
            }
            if (arr[i] > highestVal) {
                // Before overwriting the value based on previous highest, set first
                int tempVal = arr[i];
                arr[i] = highestVal;
                highestVal = tempVal;
            
            } else {
                arr[i] = highestVal;
            }
        }
        arr[arr.length-1] = -1;
        return arr;
    }
    
}