class Solution:
    def sortArrayByParity(self, A: List[int]) -> List[int]:
        last_even_index = 0
        for i in range(0, len(A)):
            if A[i] % 2 == 0:
                tmp_val = A[last_even_index]
                A[last_even_index] = A[i]
                A[i] = tmp_val
                last_even_index += 1
        
        return A
        