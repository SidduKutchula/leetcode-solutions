class Solution {
    public int adjacentSum(int i,int j,int[][] grid) {
        int sum=0;
        int m=grid.length; //row
        int n=grid[0].length; //cols
        if(j!=0) sum+=  grid[i][j-1]; // left
        if(j!=n-1) sum+= grid[i][j+1]; //right
        if(i!=0) sum+=  grid[i-1][j]; // top
        if(i!=m-1) sum+=  grid[i+1][j]; //bottom
        return sum;
    }
    public int islandPerimeter(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
              if(grid[i][j]==1) //should be island
                count += 4 -adjacentSum(i,j,grid);
           }  
        }
        return count;
    }
}