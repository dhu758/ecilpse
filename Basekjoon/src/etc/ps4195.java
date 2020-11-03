package etc;

import java.util.HashMap;
import java.util.Scanner;

public class ps4195 {
	private static int[] parent;
	private static int[] cnt;
	
	public static void union(int u, int v) {
		u = find(u);
		v = find(v);
		if(u==v) return;
		parent[u] = v;
		cnt[v] += cnt[u];
	}
	public static int find(int u) {
		if(parent[u]==u) return u;
		else return parent[u] = find(parent[u]);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		HashMap<String, Integer> map;
		for(int tc=0; tc<T; tc++) {
			int F = sc.nextInt();
			int index=0;
			map = new HashMap<>();
			parent = new int[2*F+1];
			cnt = new int[2*F+1];
			for(int f=0; f<F; f++) {
				String[] names = {sc.next(), sc.next()};
				for(int i=0; i<names.length; i++) {
					if(!map.containsKey(names[i])) {
						map.put(names[i], index);
						parent[index] = index;
						cnt[index] = 1;
						index++;
					}
				}
				union(map.get(names[0]),map.get(names[1]));
				System.out.println(cnt[find(map.get(names[1]))]);
			}
		}
	}
}
