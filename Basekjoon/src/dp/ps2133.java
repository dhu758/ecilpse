package dp;

import java.util.Scanner;

public class ps2133 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		int answer = 0;
		
		if(n%2==0) {
			arr[0]=1; arr[2]=3;
			for(int i=4; i<=n; i+=2) {
				for(int j=2; j<=i; j+=2) {
					int standard = j==2?3:2;
					arr[i] += standard*arr[i-j];
				}
			}
			answer = arr[n];
		}
		
		System.out.println(answer);
	}
}
