package dp;

import java.util.Scanner;

public class ps2156 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] wines = new int[N+1];
		int[] dp = new int[N+1];
		for(int i=1; i<=N; i++) {
			wines[i] = sc.nextInt();
		}
		if(N>=1) {
			dp[1] = wines[1];
		}
		if(N>=2) {
			dp[2] = wines[1]+wines[2];
		}
		if(N>=3) {
			dp[3] = Math.max(dp[2], Math.max(dp[1]+wines[3], wines[2]+wines[3]));
		}
		if(N>=4) {
			for(int i=4; i<=N; i++) {
				dp[i] = Math.max(dp[i-1], Math.max(dp[i-2]+wines[i], dp[i-3]+wines[i-1]+wines[i]));
			}
		}
		System.out.println(dp[N]);
	}
}
