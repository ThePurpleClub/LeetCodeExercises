class Solution {
    public int getFood(char[][] grid) {
        
        
        if(grid.length==0 || grid==null) return 0;
        Queue<int[]> pq = new LinkedList<>();
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                if(grid[i][j] == '*'){
                    pq.offer(new int[]{i,j,0});
                    break;
                }
            }
        }
        int[][]dir ={{0,1},{1,0},{-1,0},{0,-1}};
        while(!pq.isEmpty()){
            int[] arr = pq.poll();
            
            int x = arr[0];
            int y = arr[1];
            int index = arr[2];
            
            for(int i = 0; i<4; i++){
                int x_dir = x + dir[i][0];
                int y_dir = y + dir[i][1];
                
                if(x_dir<0 ||  y_dir<0 || x_dir>=grid.length || y_dir>=grid[0].length || grid[x_dir][y_dir]== 'X')
                    continue;
                if(grid[x_dir][y_dir] == '#') return index+1;
                grid[x_dir][y_dir] = 'X';
                
                pq.add(new int[]{x_dir, y_dir, index+1});
            }
        }
        
        return -1;
        
    }
}
