package pro;

import java.util.Scanner;

public class pascal {
	public static void main(String[] args) {
		int n;
		Scanner scann=new Scanner(System.in);
		System.out.print("������ �Է��ϼ���.: ");
		n=scann.nextInt();
		int[][] arr=new int[n][];
		
		for(int i=0; i<arr.length; i++) {	//�ึ�� �迭 ����
			arr[i]=new int[i+1];
		}

		
		for(int i=0; i<arr.length; i++) {	//��Ģ���� �� ã��
			for(int j=0; j<=i; j++) {
				arr[i][j]=1;				//�ϴ� �� 1 �ֱ�
				if(i>1 && j>0 && j<i) {		//��� �κ�
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];	//���
				}
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
}
