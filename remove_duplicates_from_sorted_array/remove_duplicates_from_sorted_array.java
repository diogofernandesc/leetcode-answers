class Solution {
    public int removeDuplicates(int[] nums) {
        int length = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if (i == 0 || nums[i] != nums[i-1]) {
                nums[length] = nums[i];
                length++;
            }
        }
        return length;
        
        
    }
}

// Alternatively, where wp is a writer pointer and i is read pointer
 
class Solution {
    public int removeDuplicates(int[] nums) {
        int wp = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length) {
                nums[wp] = nums[i+1];
                wp++;
            }
        }
        return wp;
    }
}

