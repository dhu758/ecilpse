package pro;

import java.util.Scanner;

public class four_mabanggin {
	public static void main(String[] args) {
		int [][]arr;
		int n, num=1;
		
		Scanner scann=new Scanner(System.in);
		System.out.print("4배수 정수를 입력하세요: ");
		n=scann.nextInt();
		
		arr=new int[n][n];
		
		for(int row=0; row<n; row++) {
			for(int col=0; col<n; col++) {
				if((row>=0&&row<n/4&&col>=n/4&&col<n/4*3)
					||(row>=n/4*3&&row<n&&col>=n/4&&col<n/4*3)
					||(row>=n/4&&row<n/4*3&&col>=0&&col<n/4)
					||(row>=n/4&&row<n/4*3&&col>=n/4*3&&col<n)) {
					arr[row][col]=n*n-num+1;
				}
				else {
					arr[row][col]=num;
				}
				num++;
			}
		}

		//출력
		for(int i=0; i<n; i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
