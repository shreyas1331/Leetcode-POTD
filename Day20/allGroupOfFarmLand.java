package Day20;
import java.util.*;
public class allGroupOfFarmLand {
	public int[][] findFarmland(int[][] land) {
        ArrayList<int[]> arr= new ArrayList<>();
        int[][] dirs= {{0,1}, {1,0}, {0,-1}, {-1,0}};
        for(int i=0;i<land.length;i++){
            for(int j=0;j<land[0].length;j++){
                if(land[i][j]==1){
                    int[] set= {i,j,0,0};
                    dfs(i, j, set, land, dirs);
                    arr.add(set);
                }
            }
        }
        return arr.toArray(new int[arr.size()][4]);
    }
    public void dfs(int i, int j, int[] set, int[][] land, int[][] dirs){
        if(i<0 || j<0 || i>=land.length || j>=land[0].length || land[i][j]==0) return;
        land[i][j]=0;
        set[2]= Math.max(set[2], i);
        set[3]= Math.max(set[3], j);
        for(int[] dir: dirs){
            dfs(i+dir[0], j+dir[1], set, land, dirs);
        }
        return;
    }
}
