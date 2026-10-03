class Solution {
    public int islandPerimeter(int[][] grid) {
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    count += 4; 
                    
                   
                    if (i > 0 && grid[i - 1][j] == 1) {
                      count--;
                    }
                   
                    if (i < rows - 1 && grid[i + 1][j] == 1) {
                        count--;
                    }
                  
                    if (j > 0 && grid[i][j - 1] == 1) {
                        count--;
                    }
                    
                    if (j < cols - 1 && grid[i][j + 1] == 1) {
                       count--;
                    }
                }
            }
        }
        return count;
    }
}