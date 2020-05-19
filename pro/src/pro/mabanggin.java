package pro;

import java.util.Scanner;

public class mabanggin {
	public static void main(String[] args) {
		int n, num=1,x,xx=0,y,yy=0;
		int [][]arr;
		
		Scanner scann=new Scanner(System.in);
		System.out.println("홀수 정수를 입력하세요.");
		n=scann.nextInt();
		
		arr=new int[n][n];
		x=0; y=n/2;
		arr[x][y]=num;
		for(int i=1; i<n*n; i++) {
			xx=x;yy=y;
			num++;
			x--;y--;
			if(x<0) {x=n-1;}
			if(y<0) {y=n-1;}
			if(arr[x][y]!=0){
				x=xx;y=yy;
				x++;
			}
			arr[x][y]=num;
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
