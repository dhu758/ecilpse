package pro;

public class OddMagicSquare {
	int n;
	int [][] arr;
	int arr_n=1;
	int x,y,xk,yk;

	public OddMagicSquare(int num){
		n=num;
		arr=new int[n][n];
	}
	
	public void make() {
		x=0;
		y=n/2;
		arr[x][y]=arr_n;
		for(int k=1; k<n*n; k++) {
			arr_n++;
			x=x-1;
			y=y-1;
			if(x<0) {
				x=n-1;
			}
			if(y<0) {
				y=n-1;
			}
			if(arr[x][y]!=0) {
				while(arr[x][y]!=0) {
				x=(x+1)+1;
				y=(y+1);
				if(x>n-1||y>n-1) {
					x=xk+1;
					y=yk;
				}
				}
			}			
			arr[x][y]=arr_n;
			xk=x;
			yk=y;
		}
	}
	
	public void print() {
		System.out.println();
		int a,b;
		for(int i=0; i<n; i++) {
			a=0;
			for(int j=0;j<n;j++) {
				System.out.printf("%3d",arr[i][j]);
				a=a+arr[i][j];
			}
			System.out.printf("%5d",a);
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<n; i++) {
			b=0;
			for(int j=0;j<n;j++) {
				b=b+arr[j][i];
			}
			System.out.printf("%3d",b);
		}
	}
}