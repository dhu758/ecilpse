package etc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ps10775 {
	static int[] parent;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int G = sc.nextInt();
		int P = sc.nextInt();
		parent = new int[G+1];
		int answer = 0;
		
		for(int g=1; g<=G; g++) {
			parent[g] = g;
		}
		
		for(int p=0; p<P; p++) {
			int num = sc.nextInt();
			int paNum = find(num);
			if(paNum!=0) {
				union(paNum, paNum-1);
				answer++;
			}
			else if(paNum==0) 
				break;
		}
		
		System.out.println(answer);
	}
	public static void union(int u, int v) {
		u = find(u);
		v = find(v);
		if(u==v) return;
		parent[u] = v;
	}
	public static int find(int u) {
		if(parent[u]==u) return u;
		else return parent[u] = find(parent[u]);
	}
}
