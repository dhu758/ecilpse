package dfs;

import java.util.Scanner;

public class ps1012 {
	static int[][] field;
	static int width, height;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseNum = sc.nextInt();
		int num;
		int answer;
		int[] answerArr = new int[caseNum];
		for(int caseN=0; caseN<caseNum; caseN++) {//case������ŭ �ݺ�
			answer=0;
			width = sc.nextInt();
			height = sc.nextInt();
			num = sc.nextInt();
			field = new int[width][height];
			for(int i=0; i<num; i++) {
				int xx = sc.nextInt();
				int yy = sc.nextInt();
				field[xx][yy]=1;//�����ִ� ���
			}
			for(int x=0; x<width; x++) {
				for(int y=0; y<height; y++) {//��� ��ġ�� ����
					if(field[x][y]==1) {//����������
						answer++;
						dfs(x, y);
					}
				}
			}
			answerArr[caseN]=answer;
		}
		for(int i=0; i<caseNum; i++) {
			System.out.println(answerArr[i]);
		}
		sc.close();
	}
	private static void dfs(int x, int y) {
		if(field[x][y]==0) {
			return;
		}
		field[x][y]=0;
		if((x+1)<width&&field[x+1][y]==1) {
			dfs(x+1,y);
		}
		if((x-1)>=0&&field[x-1][y]==1) {
			dfs(x-1,y);
		}
		if((y+1)<height&&field[x][y+1]==1) {
			dfs(x,y+1);
		}
		if((y-1)>=0&&field[x][y-1]==1) {
			dfs(x,y-1);
		}
	}
}
