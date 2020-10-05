package dfs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ps1987 {
	static char[][] board;
	static boolean[] visited;
	static int[] dy = {-1,1,0,0};
	static int[] dx = {0,0,-1,1};
	static int answer;
	static int sum;
	static int R;
	static int C;
	public static void main(String[] args) {
		answer = 0;
		Scanner sc = new Scanner(System.in);
		R = sc.nextInt();
		C = sc.nextInt();
		board = new char[R][C];
		sc.nextLine();
		for(int i=0; i<R; i++) {
			String line = sc.nextLine();
			for(int j=0; j<C; j++) {
				board[i][j] = line.charAt(j);
			}
		}
		visited = new boolean[26];
		dfs(0,0,1);
		System.out.println(answer);
	}
	private static boolean loc(int i, int j) {
		if(i>=0&&i<R&&j>=0&&j<C) {
			return true;
		}
		return false;
	}
	private static void dfs(int i, int j, int sum) {
		if(answer<sum) {
			answer=sum;
		}
		int index = (int)(board[i][j]-'A');
		visited[index] = true;
		
		for(int n=0; n<dy.length; n++) {
			int x = i+dx[n];
			int y = j+dy[n];
			if(loc(x,y)) {
				int nextIndex = (int)(board[x][y]-'A');
				if(!visited[nextIndex]) {
					dfs(x,y, sum+1);
					visited[nextIndex]=false;
				}
			}
		}
	}
}
