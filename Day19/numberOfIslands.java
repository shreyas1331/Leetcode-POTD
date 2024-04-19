package Day19;

public class numberOfIslands {
	public void dfs(char[][]a,int i,int j){
        if(i<0 || j<0 || i>=a.length || j>=a[0].length) return;
        if(a[i][j]!='1') return;
        a[i][j]='2';//When I found 1 in the character array I start DFS traversal and       marked                all the visited vertices with '9'(any character you can mark).
        dfs(a,i-1,j);  //left           adjacent neighbours
        dfs(a,i,j+1);  //
        dfs(a,i+1,j);
        dfs(a,i,j-1);
    }
    public int numIslands(char[][] grid) {
        int cnt=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    cnt++;
                    dfs(grid,i,j);
                }
            }
        }
        return cnt;
    }
}
