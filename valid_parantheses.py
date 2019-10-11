import collections


class Solution:
    def isValid(self, s: str) -> bool:
        if len(s) == 0:
            return True

        stack = collections.deque()
        stack.append(s[0])

        char_mapper = {
            ")": "(",
            "}": "{",
            "]": "[",
        }

        for char in s[1:]:
            if stack:
                peek_char = stack[-1]
                if peek_char == char_mapper.get(char):
                    stack.pop()
                    continue

            stack.append(char)

        return len(stack) == 0