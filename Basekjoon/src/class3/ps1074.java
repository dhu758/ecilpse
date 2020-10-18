package class3;

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
		zFunc(0,0,len,0);
		System.out.println(answer);
	}
	private static void zFunc(int x, int y, int len, int startNum) {
		if(x>r||x+len<=r||y>c||y+len<=c) {return;}
		if(len==2) {
			for(int dx=0; dx<2; dx++) {
				for(int dy=0; dy<2; dy++) {
					if((x+dx)==r&&(y+dy)==c) {
						answer=startNum;
						return;
					}
					startNum++;
				}
			}
		}
		else {
			zFunc(x,y,len/2,startNum);
			zFunc(x,y+len/2,len/2,startNum+(len/2)*(len/2));
			zFunc(x+len/2,y,len/2,startNum+(len/2)*(len/2)*2);
			zFunc(x+len/2,y+len/2,len/2,startNum+(len/2)*(len/2)*3);
		}
	}
}
