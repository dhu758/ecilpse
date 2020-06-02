package pro;

import java.util.Scanner;

public class six_mabanggin {
	public static void main(String[] args) {
		int n=6,num=1,x,xx=0,y,yy=0;
		int [][]arr=new int[n][n];
		
		for(int row=0;row<n/2;row++) {	//A 영역
			arr[row][0]=3;
		}
		arr[n/4][n/4]=arr[n/4][0];
		arr[1][0]=0;
		
		for(int row=0; row<n/2; row++) {	//B영역
			for(int col=n/2; col<n; col++) {
				arr[row][col]=2;
			}
		}
		for(int row=n/2; row<n; row++) {	//C영역
			for(int col=0;col<n/2; col++) {
				if(arr[row-3][col]==0) {
					arr[row][col]=3;
				}
				else if(arr[row-3][col]==3) {
					arr[row][col]=0;
				}
			}
		}
		for(int row=n/2; row<n; row++) {	//D영역
			for(int col=n/2; col<n; col++) {
				arr[row][col]=1;
			}
		}
		
		int half_n=n/2;
		int [][]half_arr=new int[half_n][half_n];	//(n/2)마방진
		x=0; y=half_n/2;
		half_arr[x][y]=num;
		for(int i=1; i<half_n*half_n; i++) {
			xx=x;yy=y;
			num++;
			x--;y--;
			if(x<0) {x=half_n-1;}
			if(y<0) {y=half_n-1;}
			if(half_arr[x][y]!=0){
				x=xx;y=yy;
				x++;
			}
			half_arr[x][y]=num;
		}
		int half_row, half_col;
		for(int row=0; row<n; row++) {	//모든 곳에 (n/2)*(n/2) 곱하기
			for(int col=0; col<n; col++) {
				arr[row][col] *= (n/2)*(n/2);
				half_row=row%(n/2);
				half_col=col%(n/2);
				arr[row][col] += half_arr[half_row][half_col];
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
