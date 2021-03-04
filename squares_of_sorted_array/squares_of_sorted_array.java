class Solution {
    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int[] newArr = new int[n];
        int left = 0;
        int right = A.length - 1;

        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(A[left]) > Math.abs(A[right])) {
                newArr[i] = A[left] * A[left];
                left++;

            } else {
                newArr[i] = A[right] * A[right];
                right--;
            }
        }
        return newArr;
    }
}