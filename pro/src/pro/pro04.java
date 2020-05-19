package pro;

public class pro04 {
	public static void main(String[] args) {
		//배열1
		System.out.println("//2차원 배열 방법");
		int[][] a=new int[4][3];
		a[0][0]=1;
		a[0][1]=2;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print("["+a[i][j]+"]");
			}
			System.out.println("");
		}
		//배열2
		System.out.println("//2차원 배열 방법2(JigJagged도 가능");
		int[][] b= {{0,0,0,0},{0,0,0,0,0},{0,0,0}};
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.print("["+b[i][j]+"]");
			}
			System.out.println("");
		}
		//배열3
		System.out.println("//2차원 배열 방법3");
		int[][] c=new int[3][5];
		int temp1=1, temp2,temp3=6;
		for(int i=0; i<c.length-1; i++) {
			temp2=temp1;
			for(int j=0; j<c[0].length; j++) {
				c[i][j]=temp2;
				temp2++;
				System.out.print("["+c[i][j]+"]");
			}
			System.out.println("");
			temp1++;
		}
		for(int k=0; k<c[0].length; k++) {
			if(temp3==10) {
				temp3=0;
			}
			else {
			c[2][k]=temp3;
			}
			System.out.print("["+c[2][k]+"]");
			temp3++;
		}
		System.out.println("");
		//배열4
		System.out.println("copy 1");
		int[][]d= new int[c.length][c[0].length];
		for(int i=0; i<d.length; i++) {
			for(int j=0; j<d[i].length; j++) {
				d[i][j]=c[i][j];
				System.out.print("["+d[i][j]+"]");
			}
			System.out.println("");
		}
	}
}
