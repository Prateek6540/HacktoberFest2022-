








































Refresh

Time (IST)	Status	Lang	Test Cases	Code
2022-10-01 22:19:40	Correct	java	132 / 132	View
Java (1.8)
Average Time:
20m
Your Time:
2m




Custom Input

// User function Template for Java
class Solution {
    int countDistinctIslands(int[][] grid) {
        HashSet<List<Integer>> set = new HashSet<>();
        boolean[][] isVisited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j] == 1 && isVisited[i][j] == false) {
                    List<Integer> list = new ArrayList<>();
                    dfs(grid, isVisited, i, j, list, i, j);
                    set.add(list);
                }
            }
        }
        
        return set.size();
    }
    void dfs(int[][] grid, boolean[][] isVisited, int r, int c, List<Integer> list, int sx, int sy) {
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0 || isVisited[r][c] == true) {
            return;
        }
        isVisited[r][c] = true;
        list.add(sx-r);
        list.add(sy-c);
        dfs(grid, isVisited, r+1, c, list, sx, sy);
        dfs(grid, isVisited, r-1, c, list, sx, sy);
        dfs(grid, isVisited, r, c+1, list, sx, sy);
        dfs(grid, isVisited, r, c-1, list, sx, sy);
    }
}
