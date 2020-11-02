package etc;

import java.util.Scanner;

public class ps1717 {
	static int[] parent;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		parent = new int[n+1];
		for(int i=0; i<=n; i++) {
			parent[i] = i;
		}
		for(int tc=0; tc<m; tc++) {
			int num = sc.nextInt();
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			if(num==0) {
				union(n1, n2);
			}
			else if(num==1) {
				if(find(n1)==find(n2))
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
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
