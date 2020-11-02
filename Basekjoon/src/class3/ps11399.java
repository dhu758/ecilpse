package class3;

import java.util.Arrays;
import java.util.Scanner;

public class ps11399 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int answer=0;
		for(int i=0; i<num; i++) {
			answer += arr[i]*(num-i);
		}
		System.out.println(answer);
	}
}
