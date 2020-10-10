package dfs;

import java.util.ArrayList;
import java.util.Scanner;

public class ps11725 {
	static int[] parents;
	static ArrayList<Integer>[] list;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		list = new ArrayList[N+1];
		parents = new int[N+1];
		for(int i=0; i<=N; i++) {
			list[i] = new ArrayList<Integer>();
		}
		int a, b;
		for(int i=0; i<N-1; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			list[a].add(b);
			list[b].add(a);
		}
		dfs(0, 1);
		for(int i=2; i<=N; i++) {
			System.out.println(parents[i]);
		}
	}
	private static void dfs(int parent, int start) {
		parents[start] = parent;
		for(int item : list[start]) {
			if(item != parent) {
				dfs(start, item);
			}
		}
	}
}
