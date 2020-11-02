package dp;

import java.util.Scanner;

public class ps1699 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		int mul2=1;
		for(int i=1; i<=n; i++) {
			if(i==mul2*mul2) {
				arr[i]=1;
				mul2++;
			}
			else {
				arr[i]=i;
				for(int j=1; j<mul2; j++) {
					arr[i] = Math.min(arr[i-j*j]+1, arr[i]);
				}
			}
		}
		System.out.println(arr[n]);
	}
}
