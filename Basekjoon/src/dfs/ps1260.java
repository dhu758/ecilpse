package dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ps1260 {
	static ArrayList<Integer>[] list;
	static int n;
	static boolean[] check;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();  //정점의 개수
		int m = sc.nextInt();  //간선의 개수
		int start = sc.nextInt();  //탐색 시작할 번호
		list = new ArrayList[n+1];  //연결된 정점 표시할 list
		
		for(int i=1; i<n+1; i++) {  //2차원 list
			list[i]=new ArrayList<Integer>();
		}
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list[a].add(b);  //연결된 정점 저장
			list[b].add(a);
		}
		for(int i=1; i<n+1; i++) {//정렬
			Collections.sort(list[i]);
		}
		
		check = new boolean[n+1];
		dfs(start);
		System.out.println();
		
		check = new boolean[n+1];
		bfs(start);
		System.out.println();
		
		sc.close();
	}
	private static void dfs(int x) {
		if(check[x]) {//방문했던거면 return
			return;
		}
		check[x]=true;//방문
		System.out.print(x+" ");
		for(int y:list[x]) {//연결된 정점이
			if(!check[y]) {//방문하지 않았으면
				dfs(y);//방문
			}
		}
	}
	private static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);//start 큐에 넣고
		check[start]=true;//방문
		
		while(!queue.isEmpty()) {//큐가 빌때까지
			int x = queue.poll();//큐에서 지운값=방문값
			System.out.print(x+ " ");
			for(int y:list[x]) {//연결된 정점들
				if(!check[y]) {//방문안했으면
					check[y]=true;//방문하고
					queue.add(y);//큐에 넣기
				}
			}
		}
	}
}
