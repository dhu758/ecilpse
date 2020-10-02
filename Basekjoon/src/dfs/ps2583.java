package dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ps2583 {
	static int h;
	static int w;
	static int k;
	static int[][] arr;
	static int areaSum;
	static ArrayList<Integer> area;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		area = new ArrayList<>();
		h = sc.nextInt();//M
		w = sc.nextInt();//N
		k = sc.nextInt();//K
		arr = new int[h][w];
		int x1=0, y1=0, x2=0, y2=0;
		int leftBottomX=0, leftBottomY=0, rightUpX=0, rightUpY=0;
		for(int i=0; i<k; i++) {
			x1 = sc.nextInt();//왼쪽 아래
			y1 = sc.nextInt();
			x2 = sc.nextInt();//오른쪽 위
			y2 = sc.nextInt();
			leftBottomX = h-y1-1;//왼쪽 아래
			leftBottomY = x1;
			rightUpX = h-y2;//오른쪽 위
			rightUpY = x2;
			for(int x=rightUpX; x<=leftBottomX; x++) {
				for(int y=leftBottomY; y<rightUpY; y++) {
					arr[x][y]=1;
				}
			}
		}
		for(int x=0; x<arr.length; x++) {
			for(int y=0; y<arr[0].length; y++) {
				if(arr[x][y]==0) {
					num++;
					areaSum=0;
					dfs(x,y);
					area.add(areaSum);
				}
			}
		}
		Collections.sort(area);
		System.out.println(num);
		for(int i=0; i<num; i++) {
			System.out.print(area.get(i)+" ");
		}
	}
	private static boolean loc(int x, int y) {
		if(x>=0&&x<h&&y>=0&&y<w) {
			return true;
		}
		return false;
	}
	private static void dfs(int x, int y) {
		if(arr[x][y]==1) {
			return;
		}
		areaSum++;
		arr[x][y] = 1;
		if(loc(x-1,y)&&arr[x-1][y]==0) {
			dfs(x-1,y);
		}
		if(loc(x+1,y)&&arr[x+1][y]==0) {
			dfs(x+1,y);
		}
		if(loc(x,y-1)&&arr[x][y-1]==0) {
			dfs(x,y-1);
		}
		if(loc(x,y+1)&&arr[x][y+1]==0) {
			dfs(x,y+1);
		}
	}
}
