package dfs;

import java.util.Scanner;

public class ps2573 {
	static int[][] maps;
	static int[][] melMaps;
	static boolean[][] visited;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	static int N;
	static int M;
	static int answer;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		answer = 0;
		N = sc.nextInt();
		M = sc.nextInt();
		maps = new int[N][M];
		melMaps = new int[N][M];
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				int number = sc.nextInt();
				maps[i][j] = number;
				melMaps[i][j] = number;
			}
		}
		int iceNum = 1;
		int answer = 0;
		while(iceNum==1) {
			answer++;
			for(int i=0; i<N; i++) {//³ì´ÂÁß
				for(int j=0; j<M; j++) {
					if(maps[i][j]!=0) {
						mel(i,j);
					}
				}
			}
			visited = new boolean[N][M];
			iceNum = 0;
			for(int i=0; i<N; i++) {//ºù»ê °³¼ö
				for(int j=0; j<M; j++) {
					maps[i][j] = melMaps[i][j];
					if(!visited[i][j]&&maps[i][j]!=0) {
						iceNum++;
						dfs(i,j);
						
					}
				}
			}
					}
		if(iceNum==0) {
			answer = 0;
		}
		System.out.println(answer);
	}
	private static boolean loc(int i, int j) {
		if(i>=0&&i<N&&j>=0&j<M) {
			return true;
		}
		return false;
	}
	private static void dfs(int i, int j) {
		if(visited[i][j]) {
			return;
		}
		visited[i][j] = true;
		for(int n=0; n<di.length; n++) {
			int nextI = i+di[n];
			int nextJ = j+dj[n];
			if(loc(nextI, nextJ)&&!visited[nextI][nextJ]&&melMaps[nextI][nextJ]!=0) {
				dfs(nextI, nextJ);
			}
		}
	}
	private static void mel(int i, int j) {
		for(int n=0; n<di.length; n++) {
			int nextI = i+di[n];
			int nextJ = j+dj[n];
			if(loc(nextI, nextJ)&&maps[nextI][nextJ]==0) {
				if(melMaps[i][j]>0) {
					melMaps[i][j]--;
				}
			}
		}
	}
}
