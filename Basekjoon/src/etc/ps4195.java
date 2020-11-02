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
		if(u==parent[u]) return u;
		else return parent[u] = find(parent[u]);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		HashMap<String, Integer> hashmap;
		for(int tc=0; tc<T; tc++) {
			int F = sc.nextInt();
			parent = new int[F*2+1];
			cnt = new int[F*2+1];
			hashmap = new HashMap<>();
			int index=0;
			for(int f=0; f<F; f++) {
				String[] names = {sc.next(), sc.next()};
				for(int i=0; i<2; i++) {
					if(!hashmap.containsKey(names[i])){
						cnt[index] = 1;
						parent[index] = index;
						hashmap.put(names[i], index);
						index++;
					}
				}
				int u = hashmap.get(names[0]);
				int v = hashmap.get(names[1]);
				union(u,v);
				System.out.println(cnt[find(v)]);
			}
		}
	}
}
