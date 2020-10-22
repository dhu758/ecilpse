package class3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class ps1764 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		HashSet<String> hs = new HashSet<String>();
		ArrayList<String> answer = new ArrayList<>();
		sc.nextLine();
		int num=0;
		String st="";
		for(int i=0; i<N; i++) {
			st = sc.nextLine();
			hs.add(st);
		}
		for(int i=0; i<M; i++) {
			st = sc.nextLine();
			if(hs.contains(st)) {
				answer.add(st);
				num++;
			}
		}
		System.out.println(num);
		Collections.sort(answer);
		for(int i=0; i<answer.size(); i++) {
			System.out.println(answer.get(i));
		}
	}
}
