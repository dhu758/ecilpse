package class3;

import java.util.Scanner;

public class ps2630 {
	static int[][] arr;
	static int blueNum;
	static int whiteNum;
	static int[][] newArr;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		blueNum=0;
		whiteNum=0;
		dfs(arr);
		System.out.println(whiteNum);
		System.out.println(blueNum);
	}
	private static boolean checkBlue(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j]!=1)
					return false;
			}
		}
		return true;
	} 
	private static boolean checkWhite(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j]!=0)
					return false;
			}
		}
		return true;
	}
	private static void dfs(int[][] arr) {
		if(checkBlue(arr)) {
			blueNum++;
			return;
		}
		else if(checkWhite(arr)) {
			whiteNum++;
			return;
		}
		else {
			int len = arr.length/2;
			newArr = new int[len][len];
			for(int i=0; i<len; i++) {
				for(int j=0; j<len; j++) {
					newArr[i][j] = arr[i][j];
				}
			}
			dfs(newArr);
			
			newArr = new int[len][len];
			for(int i=0; i<len; i++) {
				for(int j=0; j<len; j++) {
					newArr[i][j] = arr[i+len][j];
				}
			}
			dfs(newArr);
			
			newArr = new int[len][len];
			for(int i=0; i<len; i++) {
				for(int j=0; j<len; j++) {
					newArr[i][j] = arr[i][j+len];
				}
			}
			dfs(newArr);
			
			newArr = new int[len][len];
			for(int i=0; i<len; i++) {
				for(int j=0; j<len; j++) {
					newArr[i][j] = arr[i+len][j+len];
				}
			}
			dfs(newArr);
		}
	}
}
