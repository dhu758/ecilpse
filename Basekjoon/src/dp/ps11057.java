package dp;

import java.util.Scanner;

public class ps11057 {
	static int[][] arr;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new int[N+1][10];
		for(int i=0; i<10; i++) {
			arr[1][i] = 1;
		}
		dp(N);
		int answer = 0;
		for(int i=0; i<dp(N).length; i++) {
			answer += dp(N)[i];
		}
		answer %= 10007;
		System.out.println(answer);
	}
	private static int[] dp(int n) {
		if(arr[n][9]==0) {
			for(int i=0; i<10; i++) {
				for(int j=0; j<=i; j++) {
					arr[n][i] += dp(n-1)[j];
				}
				arr[n][i] %= 10007;
			}
		}
		return arr[n];
	}
}
