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
		n = sc.nextInt();  //������ ����
		int m = sc.nextInt();  //������ ����
		int start = sc.nextInt();  //Ž�� ������ ��ȣ
		list = new ArrayList[n+1];  //����� ���� ǥ���� list
		
		for(int i=1; i<n+1; i++) {  //2���� list
			list[i]=new ArrayList<Integer>();
		}
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list[a].add(b);  //����� ���� ����
			list[b].add(a);
		}
		for(int i=1; i<n+1; i++) {//����
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
		if(check[x]) {//�湮�ߴ��Ÿ� return
			return;
		}
		check[x]=true;//�湮
		System.out.print(x+" ");
		for(int y:list[x]) {//����� ������
			if(!check[y]) {//�湮���� �ʾ�����
				dfs(y);//�湮
			}
		}
	}
	private static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);//start ť�� �ְ�
		check[start]=true;//�湮
		
		while(!queue.isEmpty()) {//ť�� ��������
			int x = queue.poll();//ť���� ���=�湮��
			System.out.print(x+ " ");
			for(int y:list[x]) {//����� ������
				if(!check[y]) {//�湮��������
					check[y]=true;//�湮�ϰ�
					queue.add(y);//ť�� �ֱ�
				}
			}
		}
	}
}
