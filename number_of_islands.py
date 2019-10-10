import collections
from typing import List


class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        if not grid or not grid[0]:
            return 0

        count = 0
        for i in range(0, len(grid)):
            for j in range(0, len(grid[i])):
                if grid[i][j] == '1':
                    # self.bfs(grid, i, j)
                    self.dfs(grid, i, j)
                    count += 1

        return count

    def bfs(self, grid, x, y):
        queue = collections.deque()
        queue.append((x, y))
        grid[x][y] = '0'
        while queue:
            directions = [(0, 1), (0, -1), (1, 0), (-1, 0)]
            x, y = queue.popleft()
            for d in directions:
                new_x, new_y = x + d[0], y + d[1]
                if not (new_x < 0 or new_y < 0 or new_x >= len(grid) or new_y >= len(grid[0])) and grid[new_x][
                    new_y] == '1':
                    queue.append((new_x, new_y))
                    grid[new_x][new_y] = '0'

    def dfs(self, grid, x, y):
        if x < 0 or y < 0 or x >= len(grid) or y >= len(grid[0]) or grid[x][y] != '1':
            return 0

        grid[x][y] = '0'
        self.dfs(grid, x + 1, y)
        self.dfs(grid, x - 1, y)
        self.dfs(grid, x, y + 1)
        self.dfs(grid, x, y - 1)
