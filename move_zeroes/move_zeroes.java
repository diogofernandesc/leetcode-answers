class Solution {
    /* The idea here is really to keep the write pointer method, it will do its thing and loop till end     of the array (first pass).
    At the end of that operation, you have a pointer that tells you:
    - Anything from this pointer -> end is 0.
    So we loop again from the pointer -> end and fill with 0s.
    */
    
    public void moveZeroes(int[] nums) {
        int writePointer = 0;
        for (int i = 0 ; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[writePointer] = nums[i];
                writePointer++;
                    
            } 
        }
        
        for (int i = writePointer; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}