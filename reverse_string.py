from typing import List


class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        j = len(s) - 1
        for i, letter in enumerate(s):
            if i < j:
                s[i] = s[j]
                s[j] = letter
                j -= 1


# Alternatively you could always do "".join(s)[::-1].split() if it wasn't in place
