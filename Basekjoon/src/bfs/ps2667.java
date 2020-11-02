package bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class ps2667 {
	static int[][] arr;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int house;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		arr = new int[N][N];
		
		for(int x=0; x<N; x++) {
			st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
			for(int y=0; y<N; y++) {
				arr[x][y] = line.charAt(y)-'0';
			}
		}
		int num=0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int x=0; x<N; x++) {
			for(int y=0; y<N; y++) {
				if(arr[x][y]==1) {
					house=0;
					dfs(x,y);
					list.add(house);
					num++;
				}
			}
		}
		Collections.sort(list);
		System.out.println(num);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	private static void dfs(int x, int y) {
		house++;
		if(arr[x][y]==0) return;
		arr[x][y]=0;
		for(int i=0; i<dx.length; i++) {
			int nextX = x+dx[i];
			int nextY = y+dy[i];
			if(loc(nextX, nextY)&&arr[nextX][nextY]==1) {
				dfs(nextX, nextY);
			}
		}
	}
	private static boolean loc(int x, int y) {
		if(x>=0&&x<arr.length&&y>=0&&y<arr[0].length) {
			return true;
		}
		return false;
	}
}
