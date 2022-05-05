//1091. Shortest Path in Binary Matrix

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<int[]> queue = new LinkedList();
        int count = 0;
        if(grid[0][0]==1 || grid[grid.length-1][grid[0].length-1] ==1)return -1;
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};
        for (int i = 0; i<grid.length; i++){
            for (int j = 0; j<grid[i].length; j++){
                if(grid[i][j] == 0){
                    queue.add(new int[]{i,j});
                    break;
                }
            }
        }
        
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                int[] temp = queue.poll();
                for (int i = 0; i<8; i++){
                    int x = temp[0];
                    int y = temp[1];
                    if(x == grid.length-1 || y == grid[0].length-1) return count;
                    if(x<0 || y<0 || x>=grid.length-1 || y>=grid[0].length-1 || grid[x][y] == 1)                                  
                        continue;
                    int newX = x + dir[i][0];
                    int newY = y + dir[i][1];
                    
                    queue.add(new int[]{newX,newY});
                    grid[newX][newY] = 1;
                }     
            }
            count++;
        }
        return count;
    }
        
}
