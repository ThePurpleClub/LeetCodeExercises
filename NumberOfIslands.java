//200. Number of Islands

class Solution {
    public int numIslands(char[][] grid) {
        
        int count = 0;
        
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                if(grid[i][j] == '1')
                    count += countTheIsland(i,j,grid);
            }
        }
        return count;
    }
    
    public int countTheIsland(int i, int j, char[][] grid){
        if(grid == null|| grid.length == 0) return 0;
        
        if(i<0 || j<0 || i>grid.length-1 || j>grid[i].length-1 || grid[i][j] =='0') return 0;
        
        grid[i][j] = '0';
        
        countTheIsland(i+1, j, grid);
        countTheIsland(i, j+1, grid);
        countTheIsland(i-1, j, grid);
        countTheIsland(i, j-1, grid);
        
        return 1;
    }
}
