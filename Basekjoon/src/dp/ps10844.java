package dp;

import java.util.Scanner;

public class ps10844 {
	static long[][] arr;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new long[N+1][10];
		arr[1][0]=0;
		for(int i=1; i<10; i++) {
			arr[1][i]=1;
		}
		long answer = 0;
		dp(N);
		for(int i=0; i<dp(N).length; i++) {
			answer += dp(N)[i];
		}
		answer %= 1000000000;
		System.out.println(answer);
	}
	private static long[] dp(int n) {
		if(arr[n][1]==0) {
			arr[n][0] = dp(n-1)[1]%1000000000;
			for(int i=1; i<9; i++) {
				arr[n][i] = (dp(n-1)[i-1]+dp(n-1)[i+1])%1000000000;
			}
			arr[n][9] = dp(n-1)[8]%1000000000;
		}
		return arr[n];
	}
}