package pro;

import java.util.Scanner;

public class snail_pro2 {
	public static void main(String[] args) {
		int n,x=0,y=0,xx,yy,num=1;
		
		Scanner scann=new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		n=scann.nextInt();
		
		int [][]arr=new int[n][n];	//�迭 ����
		
		for(int i=n-1; i>0; i-=2) {	//�ð�������� i��ŭ ä���
			for(int j=0; j<i; j++) {	//y���� �κ�
				arr[x][y]=num;
				y++;
				num++;
			}
			for(int j=0; j<i; j++) {	//x���� �κ�
				arr[x][y]=num;
				x++;
				num++;
			}
			for(int j=0; j<i; j++) {	//y���� �κ�
				arr[x][y]=num;
				y--;
				num++;
			}
			for(int j=0; j<i; j++) {	//x���� �κ�
				arr[x][y]=num;
				x--;
				num++;
			}
			x++;
			y++;
		}
		
		if(n%2!=0) {	//Ȧ���϶� ���ĭ ä���
			arr[x][y]=num;
		}
		
		//���
		for(int i=0; i<n; i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
