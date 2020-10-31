package dp;

import java.util.Scanner;

public class ps11053 {
	static int[] result;
	static int[] arr;
	static int answer;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new int[N];
		result = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		answer=1;
		result[0] = 1;
		for(int i=1; i<N; i++) {
			dp(i);
		}
		System.out.println(answer);
	}
	private static void dp(int index) {
		int max = 1;
		for(int i=0; i<index; i++) {
			if(arr[i]<arr[index]) {
				max = Math.max(result[i]+1, max);
			}
		}
		result[index] = max;
		answer = Math.max(answer, max);
	}
}
