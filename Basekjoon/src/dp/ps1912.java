package dp;

import java.util.Scanner;

public class ps1912 {
	static int[] arr;
	static int[] result;
	static int answer;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n];
		result = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		result[0] = arr[0];
		answer = arr[0];
		for(int i=1; i<n; i++) {
			result[i] = Math.max(result[i-1]+arr[i], arr[i]);
			answer = Math.max(answer, result[i]);
		}
		System.out.println(answer);
	}
}
