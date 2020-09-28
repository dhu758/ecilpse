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
		int num = sc.nextInt();	//��ǻ�� ��
		int linkedNum = sc.nextInt();	//����� ��ǻ�� ���� ��
		int start=1;	//1���� ����
		netList = new ArrayList[num+1];//network ������ list
		
		for(int i=1; i<num+1; i++) {//������ ���� arraylist��
			netList[i]=new ArrayList<Integer>();
		}
		for(int i=0; i<linkedNum; i++) {//network ����
			int u = sc.nextInt();
			int v = sc.nextInt();
			netList[u].add(v);
			netList[v].add(u);
		}
		for(int i=1; i<num+1; i++) {//����� com ��� ����
			Collections.sort(netList[i]);
		}
		check = new boolean[num+1];//check ���� �迭
		dfs(start);
		answer--;	//�ڱ��ڽ��� 1�� ����
		System.out.print(answer);
		
		sc.close();
	}
	private static void dfs(int start) {
		if(check[start]) {//�湮�ߴ��Ÿ� return
			return;
		}
		check[start]=true;//�湮
		answer++;//�湮�� com ���� +1
		for(int n:netList[start]) {	//start�� ����� com ��
			if(!check[n]) {	//�湮 ��������
				dfs(n);	//dfs
			}
		}
	}
}
