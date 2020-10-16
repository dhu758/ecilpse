package dfs;

import java.util.HashMap;
import java.util.Scanner;

public class ps1620 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		HashMap<String, String> namesMap = new HashMap<>();
		String[] answer = new String[M];
		String number, name;
		for(int i=1; i<=N; i++) {
			name = sc.nextLine();
			number = Integer.toString(i);
			namesMap.put(name, number);
			namesMap.put(number, name);
		}
		for(int i=0; i<M; i++) {
			answer[i] = namesMap.get(sc.nextLine());
		}
		for(int i=0; i<M; i++) {
			System.out.println(answer[i]);
		}
	}
}
