package class3;

import java.util.Scanner;

public class ps11726 {
	static int[] arr;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n+1];
		arr[0]=1;
		arr[1]=1;
		int answer = dp(n);
		System.out.println(answer);
	}
	private static int dp(int n) {
		if(arr[n]==0) {
			arr[n] = (dp(n-1)+dp(n-2))%10007;
			return arr[n];
		}
		return arr[n];
	}
}
