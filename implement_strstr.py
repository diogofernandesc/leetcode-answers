# Leetcode - implement strStr


class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if not needle:
            return 0

        if needle in haystack:
            for i, letter in enumerate(haystack):
                if needle.startswith(letter):
                    if haystack[i:i + len(needle)] == needle:
                        return i

        return -1    
