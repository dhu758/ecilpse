package dp;

import java.util.Scanner;

public class ps9095 {
	static int[] arr;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		arr = new int[11];
		arr[1]=1;
		arr[2]=2;
		arr[3]=4;
		int T = sc.nextInt();
		for(int tc=0; tc<T; tc++) {
			int n = sc.nextInt();
			System.out.println(dp(n));
		}
	}
	private static int dp(int n) {
		if(arr[n]==0) {
			arr[n] = dp(n-1)+dp(n-2)+dp(n-3);
			return arr[n];
		}
		return arr[n];
	}
}
