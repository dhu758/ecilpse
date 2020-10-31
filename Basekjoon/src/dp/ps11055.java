package dp;

import java.util.Scanner;

public class ps11055 {
	static int answer;
	static int[] arr;
	static int[] sum;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new int[N];
		sum = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		sum[0] = arr[0];
		answer = sum[0];
		for(int i=1; i<N; i++) {
			dp(i);
		}
		System.out.println(answer);
	}
	private static void dp(int index) {
		sum[index] = arr[index];
		for(int i=0; i<index; i++) {
			if(arr[i]<arr[index]) {
				sum[index] = Math.max(sum[i]+arr[index], sum[index]);
			}
		}
		answer = Math.max(answer, sum[index]);
	}
}
