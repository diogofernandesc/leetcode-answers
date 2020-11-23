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

// Use the pointer again, this time just need to keep track of the last seen element (i - 1) as the value to compare against.