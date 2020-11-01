package dp;

import java.util.Scanner;

public class ps11722 {
	static int answer;
	static int[] arr;
	static int[] len;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new int[N];
		len = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		answer = 1;
		len[0] = 1;
		for(int i=1; i<N; i++) {
			dp(i);
		}
		System.out.println(answer);
	}
	private static void dp(int index) {
		len[index] = 1;
		for(int i=0; i<index; i++) {
			if(arr[i]>arr[index]) {
				len[index] = Math.max(len[i]+1, len[index]);
			}
		}
		answer = Math.max(len[index], answer);
	}
}
