package dp;

import java.util.Scanner;

public class ps9465 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] arr;
		int[][] result;
		int T = sc.nextInt();
		for(int tc=0; tc<T; tc++) {
			int n = sc.nextInt();
			arr = new int[2][n+1];
			result = new int[2][n+1];
			for(int x=0; x<2; x++) {
				for(int y=1; y<=n; y++) {
					arr[x][y] = sc.nextInt();
				}
			}
			result[0][1] = arr[0][1];
			result[1][1] = arr[1][1];
			for(int i=2; i<=n; i++) {
				result[0][i] = Math.max(result[1][i-1], result[1][i-2])+arr[0][i];
				result[1][i] = Math.max(result[0][i-1], result[0][i-2])+arr[1][i];
			}
			System.out.println(Math.max(result[0][n], result[1][n]));
		}
	}
}
