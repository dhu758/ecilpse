package class3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ps7576 {
	static int answer;
	static int num;
	static int M;
	static int N;
	static Queue<DOT> q = new LinkedList<DOT>();
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		int[][] tomatoes = new int[N][M];
		num=0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				tomatoes[i][j] = sc.nextInt();
				if(tomatoes[i][j]!=0) {
					num++;
				}
				if(tomatoes[i][j]==1) {
					q.offer(new DOT(i,j));
				}
			}
		}
		if(num==N*M) {
			answer = 0;
		}
		else {
			answer=0;
			bfs(tomatoes);
			if(num==N*M) {
				answer--;
			}
			else {
				answer = -1;
			}
		}
		System.out.println(answer);
		
	}
	private static void bfs(int[][] tomatoes) {
		int[] dx = {-1,1,0,0};
		int[] dy = {0,0,-1,1};
		while(!q.isEmpty()) {
			DOT dot = q.poll();
			int x = dot.x;
			int y = dot.y;
			for(int i=0; i<dx.length; i++) {
				int nextX = x+dx[i];
				int nextY = y+dy[i];
				if(loc(nextX,nextY)&&tomatoes[nextX][nextY]==0) {
					tomatoes[nextX][nextY] = tomatoes[x][y]+1;
					answer = tomatoes[nextX][nextY];
					q.offer(new DOT(nextX, nextY));
					num++;
				}
			}
		}
	}
	private static boolean loc(int x, int y) {
		if(x>=0&&x<N&&y>=0&&y<M) {
			return true;
		}
		return false;
	}
}
class DOT{
	int x;
	int y;
	
	DOT(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
