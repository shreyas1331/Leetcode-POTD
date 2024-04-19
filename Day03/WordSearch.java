package Day03;

import java.util.Scanner;

public class WordSearch {
	static boolean[][]visited;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        char[][] board = new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }
        System.out.print("Enter the word to search: ");
        String word = sc.next();
        solve(board,row,col,word);
	}
	public static void solve(char[][]board,int row,int col,String word) {
		visited=new boolean[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(word.charAt(0)==board[i][j] && f(board,i,j,0,word,visited)) {
					System.out.println("true");
				}
			}
		}
		System.out.println("false");
	}
	public static boolean f(char[][]arr,int i,int j,int idx,String word,boolean[][]visited) {
		if(idx==word.length()) {
			return true;
		}
		if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]!=word.charAt(idx) ||
		         visited[i][j]){
		            return false;
		        }
		        
		visited[i][j]=true;
		if(
		  f(arr,i+1,j,idx+1,word,visited)||
		  f(arr,i-1,j,idx+1,word,visited)||
		  f(arr,i,j+1,idx+1,word,visited)||
		  f(arr,i,j-1,idx+1,word,visited)
		){
		     return true;
		  }
		visited[i][j]=false;
		return false;
	}

}
