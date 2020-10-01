package dfs;

import java.util.Scanner;

public class ps2468 {
	static int[][] arr;
	static boolean[][] check;
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N][N];
		int max = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				arr[i][j] = sc.nextInt();
				if(max<arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
		int answer = 0;
		for(int r=0; r<=max; r++) {
			check = new boolean[N][N]; 
			int num = 0;
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(arr[i][j]>r) {
						check[i][j]=true;
					}
				}
			}
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(check[i][j]) {
						num++;
						dfs(i,j);
					}
				}
			}
			if(num>answer) {
				answer=num;
			}
		}
		System.out.println(answer);
	}
	private static boolean loc(int x, int y) {
		if(x<N&&x>=0&&y<N&&y>=0) {
			return true;
		}
		return false;
	}
	private static void dfs(int x, int y) {
		if(!check[x][y]) {
			return;
		}
		check[x][y] = false;
		if(loc(x-1,y)&&check[x-1][y]) {
			dfs(x-1,y);
		}
		if(loc(x+1,y)&&check[x+1][y]) {
			dfs(x+1,y);
		}
		if(loc(x,y-1)&&check[x][y-1]) {
			dfs(x,y-1);
		}
		if(loc(x,y+1)&&check[x][y+1]) {
			dfs(x,y+1);
		}
	}
}
