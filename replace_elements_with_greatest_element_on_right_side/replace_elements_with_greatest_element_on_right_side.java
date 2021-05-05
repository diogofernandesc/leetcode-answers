// Prettier O(n) solution
class Solution {
    public int[] replaceElements(int[] arr) {
        int highestVal = arr[arr.length-1];
        for (int i = arr.length - 2; i >= 0; i--) {
            int tmpVal = arr[i];
            arr[i] = highestVal;
            if (tmpVal > highestVal) {
                highestVal = tmpVal;
            }
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}

// O(n)2 solution with check from left
class Solution {
    public int[] replaceElements(int[] arr) {
        int highestVal;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                highestVal = arr[i+1];
                for (int j = i + 2; j < arr.length; j++) {
                    if (arr[j] > highestVal) {
                        highestVal = arr[j];
                    }
                }
                arr[i] = highestVal;
            
            } else {
                arr[i] = -1;
            }
        }
        return arr;
    }
}