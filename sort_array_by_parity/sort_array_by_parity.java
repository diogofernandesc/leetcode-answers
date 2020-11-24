// My semi quick sort solution
class Solution {
    public int[] sortArrayByParity(int[] A) {
        Integer oddPointer = null;
        
        int i = 0;
        while (i < oddPointer) {
            if (oddPointer == null && A[i] % 2 != 0) {
                oddPointer = i;
            }
            
            if (oddPointer != null && oddPointer < i && A[i] % 2 == 0) {
                // perform the swap
                int oddValue = A[oddPointer];
                int currentValue = A[i];
                A[oddPointer] = currentValue;
                A[i] = oddValue;
                i = oddPointer + 1;
                oddPointer = null;
            }
            else {
                i++;
            }
        }
        return A;
        
    }
}

// Best solution - as found on solutions - this one makes a lot of sense why didn't I do this!
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int lastEvenIndex = 0;
        for (int i=0; i< A.length; i++) {
            if (A[i] % 2 == 0) {
                int tmp = A[lastEvenIndex];
                A[lastEvenIndex] = A[i];
                A[i] = tmp;
                lastEvenIndex++ ;
            }
        }  
        return A;
    }
}