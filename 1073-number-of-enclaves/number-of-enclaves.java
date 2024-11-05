/*class Pair{
    int row,col;
    Pair(int _row,int _col)
    {
        this.row=_row;
        this.col=_col;
    }
}
class Solution {
    public int numEnclaves(int[][] g) {
        int m=g.length,n=g[0].length;
        int b[][]=new int[m][n];
        Queue<Pair> q=new LinkedList<>();
        //rows
        for(int i=0;i<n;i++)
        {
            if(g[0][i]==1)
            {
                q.add(new Pair(0,i));
                b[0][i]=1;
            }
            if(g[m-1][i]==1)
            {
                q.add(new Pair(m-1,i));
                b[m-1][i]=1;
            }
        }
        for(int i=0;i<m;i++)
        {
            if(g[i][0]==1 && b[0][i]==0)
            {
                q.add(new Pair(i,0));
                b[i][0]=1;
            }
            if(g[i][n-1]==1 && b[i][n-1]==0)
            {
                q.add(new Pair(i,n-1));
                b[i][n-1]=1;
            }
        }
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};
        while(!q.isEmpty())
        {
            int r=q.peek().row,c=q.peek().col;
            q.poll();
            for(int i=0;i<4;i++)
            {
                int nrow=r+drow[i];
                int ncol=c+dcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && g[nrow][ncol]==1 && b[nrow][ncol]==0)
                {
                    b[nrow][ncol]=1;
                    q.offer(new Pair(nrow,ncol));
                }
            }
        }
        int ans = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(g[i][j]==1 && b[i][j]==0)
                {
                    ans++;
                }
            }
        }
        return ans;
    }
}*/
class Solution {

    
    public int numEnclaves(int[][] grid) {
        // remove all boundary  and connected 1s
        for(int i=0; i<grid.length; i++){
            dfp(grid,i,0);
            dfp(grid,i,grid[0].length-1);
        }
        for(int j=0; j<grid[0].length; j++){
            dfp(grid,0,j);
            dfp(grid,grid.length-1,j);
        }
        // count remaining 1s
        int count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1) count++;
            }
        }
        return count;
    }
    public static void dfp(int[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1){
            return;
        }
        grid[i][j] = -1;
        dfp(grid,i+1,j);
        dfp(grid,i-1,j);
        dfp(grid,i,j+1);
        dfp(grid,i,j-1);
    }
}