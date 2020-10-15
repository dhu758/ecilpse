package dfs;

import java.util.Scanner;

public class ps1074 {
	static int answer;
	static int r;
	static int c;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		r = sc.nextInt();
		c = sc.nextInt();
		answer = 0;
		int len = (int) Math.pow(2, N);
		z(0,0,len);
		
	}
	private static void z(int x, int y, int arrLen) {
//		if(y > r || y+arrLen <= r || x > c || x+arrLen <= c) return;
		if(arrLen==2) {
			for(int dx=0; dx<=2; dx++) {
				for(int dy=0; dy<=2; dy++) {
					if((x+dx)==r&&(y+dy)==c) {
//						System.out.println(answer);
						return;
					}
					answer++;
					System.out.println(answer);
				}
			}
		}
		else {
			int minusLen = arrLen/2;
			z(x,y,minusLen);
			z(x,y+minusLen,minusLen);
			z(x+minusLen,y,minusLen);
			z(x+minusLen,y+minusLen,minusLen);
		}
	}
}
