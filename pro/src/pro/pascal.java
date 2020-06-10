package pro;

import java.util.Scanner;

public class pascal {
	public static void main(String[] args) {
		int n;
		Scanner scann=new Scanner(System.in);
		System.out.print("정수를 입력하세요.: ");
		n=scann.nextInt();
		int[][] arr=new int[n][];
		
		for(int i=0; i<arr.length; i++) {	//행마다 배열 생성
			arr[i]=new int[i+1];
		}

		
		for(int i=0; i<arr.length; i++) {	//규칙통해 값 찾기
			for(int j=0; j<=i; j++) {
				arr[i][j]=1;				//일단 다 1 넣기
				if(i>1 && j>0 && j<i) {		//계산 부분
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];	//계산
				}
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
}
