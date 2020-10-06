package dfs;

import java.util.Scanner;

public class ps10026 {
	static int N;
	static char[][] grid1; //적록색약 아닌 사람
	static char[][] grid2; //적록색약인 사람
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	static int answer1;
	static int answer2;
	public static void main(String[] args) {
		answer1 = 0;
		answer2 = 0;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.nextLine();
		grid1 = new char[N][N];
		grid2 = new char[N][N];
		char ch;
		for(int i=0; i<N; i++) {
			String line = sc.nextLine();
			for(int j=0; j<N; j++) {
				ch = line.charAt(j);
				grid1[i][j] = ch;
				if(ch=='G') {
					grid2[i][j] = 'R';
				}
				else {
					grid2[i][j] = ch;
				}
			}
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(grid1[i][j]!='A') {
					answer1++;
					dfs(i,j,grid1);
				}
			}
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(grid2[i][j]!='A') {
					answer2++;
					dfs(i,j,grid2);
				}
			}
		}
		System.out.print(answer1+" ");
		System.out.print(answer2);
	}
	private static boolean loc(int i, int j) {
		if(i>=0&&i<N&&j>=0&&j<N) {
			return true;
		}
		return false;
	}
	private static void dfs(int i, int j, char[][] grid) {
		if(grid[i][j]=='A') {
			return;
		}
		char ijCh = grid[i][j];
		grid[i][j] = 'A';
		for(int k=0; k<di.length; k++) {
			int nextI = i+di[k];
			int nextJ = j+dj[k];
			if(loc(nextI, nextJ)&&grid[nextI][nextJ]==ijCh) {
				dfs(nextI, nextJ, grid);
			}
		}
	}
}
