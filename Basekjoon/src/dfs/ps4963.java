package dfs;

import java.util.ArrayList;
import java.util.Scanner;

public class ps4963 {
	static int[][] map;
	static int answer;
	static int w;
	static int h;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> answerList = new ArrayList<>();
		while(true) {
			answer=0;
			w = sc.nextInt();
			h = sc.nextInt();
			if(w==0&&h==0) {
				break;
			}
			map = new int[w][h];
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					map[j][i] = sc.nextInt();
				}
			}
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					if(map[j][i]==1) {
						answer++;
						dfs(j,i);
					}
				}
			}
			answerList.add(answer);
		}
		for(int i=0; i<answerList.size(); i++) {
			System.out.println(answerList.get(i));
		}
	}
	private static boolean loc (int x, int y) {
		if(x<w&&y<h&&x>=0&&y>=0) {
			return true;
		}
		return false;
	}
	private static void dfs(int x, int y) {
		
		if(map[x][y]==0) {
			return;
		}
		map[x][y]=0;
		for(int i=-1; i<=1; i++) {
			for(int j=-1; j<=1; j++) {
				if(loc(x+i, y+j)&&map[x+i][y+j]==1) {
					dfs(x+i, y+j);
				}
			}
		}
	}
}
