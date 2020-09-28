package dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ps2606 {
	static ArrayList<Integer>[] netList;
	static boolean[] check;
	static int answer=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();	//컴퓨터 수
		int linkedNum = sc.nextInt();	//연결된 컴퓨터 쌍의 수
		int start=1;	//1부터 감염
		netList = new ArrayList[num+1];//network 저장할 list
		
		for(int i=1; i<num+1; i++) {//각각의 형을 arraylist로
			netList[i]=new ArrayList<Integer>();
		}
		for(int i=0; i<linkedNum; i++) {//network 저장
			int u = sc.nextInt();
			int v = sc.nextInt();
			netList[u].add(v);
			netList[v].add(u);
		}
		for(int i=1; i<num+1; i++) {//연결된 com 목록 정렬
			Collections.sort(netList[i]);
		}
		check = new boolean[num+1];//check 넣을 배열
		dfs(start);
		answer--;	//자기자신인 1번 빼기
		System.out.print(answer);
		
		sc.close();
	}
	private static void dfs(int start) {
		if(check[start]) {//방문했던거면 return
			return;
		}
		check[start]=true;//방문
		answer++;//방문한 com 개수 +1
		for(int n:netList[start]) {	//start와 연결된 com 중
			if(!check[n]) {	//방문 안했으면
				dfs(n);	//dfs
			}
		}
	}
}
