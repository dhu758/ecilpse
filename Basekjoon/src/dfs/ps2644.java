package dfs;

import java.util.Scanner;

public class ps2644 {
	static int num;
	static int x;
	static int y;
	static int answer;
	static int[][] family;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		answer = -1;
		int n = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		num = sc.nextInt();
		family = new int[num][2];
		boolean[] bool = new boolean[n+1];
		for(int i=0; i<num; i++) {
			for(int j=0; j<2; j++) {
				family[i][j] = sc.nextInt();
			}
		}
		if(x==y) {
			System.out.println(0);
			return;
		}
		dfs(y,bool,0);
//		System.out.println();
		System.out.println(answer);
	}
	private static void dfs(int c, boolean[] b, int sum) {
		b[c] = true;
//		System.out.println(c);
		int p;
		for(int i=0; i<num; i++) {
			if(family[i][0] == c) {
				p = family[i][1];
				if(!b[p]) {
					if(p==x) {
//						System.out.println(p);
						answer=sum+1;
						return;
					}
					b[p]=true;
					dfs(p, b, sum+1);
					b[p]=false;
				}
			}
			if(family[i][1] == c) {
				p = family[i][0];
				if(!b[p]) {
					if(p==x) {
//						System.out.println(p);
						answer=sum+1;
						return;
					}
					b[p]=true;
					dfs(p, b, sum+1);
					b[p]=false;
				}
			}
		}
	}
}
