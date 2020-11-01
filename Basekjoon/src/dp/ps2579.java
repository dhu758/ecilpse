package dp;

import java.util.Scanner;

public class ps2579 {
	static int[] arr;
	static int[] result;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n];
		result = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		if(n>=1) {
			result[0] = arr[0];
		}
		if(n>=2) {
			result[1] = arr[0]+arr[1];
		}
		if(n>=3) {
			result[2] = Math.max(arr[0]+arr[2], arr[1]+arr[2]);
		}
		for(int i=3; i<n; i++) {
				result[i] = Math.max(result[i-2]+arr[i], result[i-3]+arr[i-1]+arr[i]);
		}
		System.out.println(result[n-1]);
	}
}
