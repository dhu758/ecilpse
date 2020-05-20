package pro;

import java.util.Scanner;

public class snail_pro {
	public static void main(String[] args) {
		int n,x=0,y=0,xx=1,yy=1, num=1;
		int [][]arr;
		
		Scanner scann=new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		n=scann.nextInt();
		
		arr=new int[n][n];
		
		for(int i=n-1; i>1; i-=2) {
			
			for(int j=0; j<i; j++) {
				arr[x][y]=num;
				y++;num++;
			}

			for(int j=0; j<i; j++) {
				arr[x][y]=num;
				x++;num++;
			}
			for(int j=0; j<i; j++) {		
				arr[x][y]=num;
				y--;num++;
			}
			for(int j=0; j<i; j++) {			
				arr[x][y]=num;
				x--;num++;
			}
			x++;y++;
		}
		if(n%2!=0) {
			arr[n/2][n/2]=num;
		}
		if(n%2==0) {
			arr[n/2-1][n/2-1]=num;
			num++;
			arr[n/2-1][n/2]=num;
			num++;
			arr[n/2][n/2]=num;
			num++;
			arr[n/2][n/2-1]=num;
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
