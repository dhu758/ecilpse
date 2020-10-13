package dfs;

import java.util.Scanner;

public class ps1003 {
	static int num0, num1;
	static Integer[][] dp = new Integer[41][2];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int number;
		dp[0][0]=1;
		dp[0][1]=0;
		dp[1][0]=0;
		dp[1][1]=1;
		Integer[][] answers = new Integer[T][2];
		for(int i=0; i<T; i++) {
			number = sc.nextInt();
			answers[i] = fibonacciNum(number);
		}
		for(int i=0; i<T; i++) {
			System.out.println(answers[i][0]+" "+answers[i][1]);
		}
	}
	private static Integer[] fibonacciNum(int n) {
		if(dp[n][0] == null || dp[n][1] == null) {
			dp[n][0] = fibonacciNum(n-1)[0] + fibonacciNum(n-2)[0];
			dp[n][1] = fibonacciNum(n-1)[1] + fibonacciNum(n-2)[1];
		}
		return dp[n];
	}
}
