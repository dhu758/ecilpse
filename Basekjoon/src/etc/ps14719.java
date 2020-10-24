package etc;

import java.util.Scanner;

public class ps14719 {
	static int[] arr;
	static int answer;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		arr = new int[w];
		for(int i=0; i<w; i++) {
			arr[i] = sc.nextInt();
		}
		answer=0;
		for(int i=1; i<w-1; i++) {
			func(arr,i);
		}
		System.out.println(answer);
	}
	private static void func(int[] arr, int i){
		int leftMax = 0;
		int rightMax = 0;
		for(int left=0; left<i; left++) {
			if(arr[left]>leftMax) {
				leftMax = arr[left];
			}
		}
		for(int right=i+1; right<arr.length; right++) {
			if(arr[right]>rightMax) {
				rightMax = arr[right];
			}
		}
		if(leftMax>arr[i]&&rightMax>arr[i]) {
			if(leftMax>=rightMax) {
				answer += rightMax-arr[i];
			}
			else if(leftMax<rightMax) {
				answer += leftMax-arr[i];
			}
		}
	}
}
