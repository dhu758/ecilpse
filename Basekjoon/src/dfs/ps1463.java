package dfs;

import java.util.Scanner;

public class ps1463 {
	static int answer;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		answer=0;
		dfs(N,0);
		System.out.println(answer);
	}
	private static void dfs(int N, int sum) {
//		System.out.println(N);
		if(N<1||(sum>=answer&&answer!=0)) {
			return;
		}
		if(N==1) {
			if(sum<answer||answer==0) {
				answer=sum;
				return;
			}
		}
		if(N%3==0) {
			dfs(N/3,sum+1);
		}
		if(N%2==0) {
			dfs(N/2, sum+1);
		}
		if(N>0) {
			dfs(N-1, sum+1);
		}
	}
}
