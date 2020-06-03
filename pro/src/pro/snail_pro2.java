package pro;

import java.util.Scanner;

public class snail_pro2 {
	public static void main(String[] args) {
		int n,x=0,y=0,xx,yy,num=1;
		
		Scanner scann=new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		n=scann.nextInt();
		
		int [][]arr=new int[n][n];	//배열 생성
		
		for(int i=n-1; i>0; i-=2) {	//시계방향으로 i만큼 채우기
			for(int j=0; j<i; j++) {	//y증가 부분
				arr[x][y]=num;
				y++;
				num++;
			}
			for(int j=0; j<i; j++) {	//x증가 부분
				arr[x][y]=num;
				x++;
				num++;
			}
			for(int j=0; j<i; j++) {	//y감소 부분
				arr[x][y]=num;
				y--;
				num++;
			}
			for(int j=0; j<i; j++) {	//x감소 부분
				arr[x][y]=num;
				x--;
				num++;
			}
			x++;
			y++;
		}
		
		if(n%2!=0) {	//홀수일때 가운데칸 채우기
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
