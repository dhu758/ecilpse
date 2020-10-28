package dp;

import java.util.Scanner;

public class ps2193 {
	static long[][] arr;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new long[N+1][2];
		arr[1][0]=0;
		arr[1][1]=1;
		dp(N);
		long answer = arr[N][0] + arr[N][1];
		System.out.println(answer);
	}
	private static long[] dp(int n) {
		if(n!=1&&arr[n][0]==0) {
			arr[n][0] = dp(n-1)[0] + dp(n-1)[1];
			arr[n][1] = dp(n-1)[0];
		}
		return arr[n];
	}
}
