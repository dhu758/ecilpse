package dp;

import java.util.Scanner;

public class ps11054 {
	static int answer;
	static int[] arr1;
	static int[] arr2;
	static int[] AscLen;
	static int[] DescLen;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr1 = new int[N];
		arr2 = new int[N];
		for(int i=0; i<N; i++) {
			int num = sc.nextInt();
			arr1[i] = num;
			arr2[arr2.length-1-i] = num;
		}
		answer = 1;
		AscLen = new int[arr1.length];
		AscLen[0]=1;
		DescLen = new int[arr2.length];
		DescLen[0]=1;
		for(int i=1; i<N; i++) {
			dp1(i);dp2(i);
		}
		for(int i=1; i<N; i++) {
			answer = Math.max(answer, AscLen[i]+DescLen[DescLen.length-1-i]-1);
		}
		System.out.println(answer);
	}
	private static void dp1(int index) {
		AscLen[index] = 1;
		for(int i=0; i<index; i++) {
			if(arr1[i]<arr1[index]) {
				AscLen[index] = Math.max(AscLen[i]+1, AscLen[index]);
			}
		}
	}
	private static void dp2(int index) {
		DescLen[index] = 1;
		for(int i=0; i<index; i++) {
			if(arr2[i]<arr2[index]) {
				DescLen[index] = Math.max(DescLen[i]+1, DescLen[index]);
			}
		}
	}
}
