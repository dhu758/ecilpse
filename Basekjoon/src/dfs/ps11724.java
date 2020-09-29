package dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ps11724 {
	static ArrayList<Integer>[] net;
	static boolean[] check;
	static int answer;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dotNum = sc.nextInt();
		int lineNum = sc.nextInt();
		answer=0;
		net = new ArrayList[dotNum+1];
		for(int i=1; i<dotNum+1; i++) {
			net[i] = new ArrayList<Integer>();
		}
		for(int i=0; i<lineNum; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			net[u].add(v);
			net[v].add(u);
		}
		for(int i=1; i<dotNum+1; i++) {
			Collections.sort(net[i]);
		}
		check = new boolean[dotNum+1];
		for(int i=1; i<dotNum+1; i++) {
			if(!check[i]) {
				dfs(i);
				answer++;
			}
		}
		System.out.println(answer);
		sc.close();
	}
	private static void dfs(int start) {
		if(check[start]) {
			return;
		}
		check[start]=true;
		for(int n: net[start]) {
			if(!check[n]) {
				dfs(n);
			}
		}
	}
}
