package dp;

import java.util.Scanner;

public class ps11727 {
	static int[] arr;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n+1];
		arr[1] = 1;
		System.out.println(dp(n));
	}
	private static int dp(int n) {
		if(arr[n]==0) {
			if(n%2==0) 
				arr[n] = dp(n-1)*2 + 1;
			else
				arr[n] = dp(n-1)*2 - 1;
			return arr[n]%10007;
		}
		return arr[n]%10007;
	}
}