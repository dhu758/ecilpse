package pro;

public class SNail {
	int m,mk,n,nk,x=0,y=0,num=1;
	int[][] loc;
	
	public SNail(int num1, int num2){
		m=num1;
		n=num2;
		loc=new int[m][n];
	}
	
	public void make() {
		mk=m;
		nk=n;
		for(int i=0; i<m/2; i++) {
			
			while((loc[x][y+1]==0&&y<mk)||y==n/2) {
				loc[x][y]=num;
				num++;
				y++;

				if(y==mk-2) {
					loc[x][y]=num;
					num++;
					loc[x][y+1]=num;
					num++;
					break;
				}
				
			}
			x++;
			y++;
			while(x<nk&&loc[x+1][y]==0) {
				if(x==nk-2) {
					loc[x][y]=num;
					num++;
					loc[x+1][y]=num;
					num++;
					break;
				}
				loc[x][y]=num;
				num++;
				x++;
			}	
			y--;
			x++;
			while(loc[x][y-1]==0&&y>=0) {
				if(y==n-nk+1) {
					loc[x][y]=num;
					num++;
					loc[x][y-1]=num;
					num++;
					break;
				}
				loc[x][y]=num;
				num++;
				y--;

			}
			x--;
			y--;
			while((loc[x-1][y]==0&&x>=0)||x==m/2) {
				if(x==m-mk+2) {
					loc[x][y]=num;
					num++;
					loc[x-1][y]=num;
					num++;
					break;
				}
				loc[x][y]=num;
				num++;
				x--;

			}
			loc[m/2][n/2]=num;
			y++;
			x--;
			mk--;
			nk--;
		}
	}
	
	public void print() {
		for(int i=0; i<m; i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("(%2d)",loc[i][j]);
			}
			System.out.println();
		}
	}

	public void make2() {
		// TODO Auto-generated method stub
		mk=m;//За
		nk=n;//ї­
		for(int i=0; i<m/2; i++) {
			
			while((loc[x+1][y]==0&&x<mk)||x==n/2) {
				loc[x][y]=num;
				num++;
				x++;

				if(x==mk-2) {
					loc[x][y]=num;
					num++;
					loc[x+1][y]=num;
					num++;
					break;
				}
				
			}
			x++;
			y++;
			while(y<nk&&loc[x][y+1]==0) {
				if(y==nk-2) {
					loc[x][y]=num;
					num++;
					loc[x][y+1]=num;
					num++;
					break;
				}
				loc[x][y]=num;
				num++;
				y++;
			}	
			x--;
			y++;
			while(loc[x-1][y]==0&&x>=0) {
				if(x==n-nk+1) {
					loc[x][y]=num;
					num++;
					loc[x-1][y]=num;
					num++;
					break;
				}
				loc[x][y]=num;
				num++;
				x--;

			}
			x--;
			y--;
			while((loc[x][y-1]==0&&x>=0)||y==m/2) {
				if(y==m-mk+2) {
					loc[x][y]=num;
					num++;
					loc[x][y-1]=num;
					num++;
					break;
				}
				loc[x][y]=num;
				num++;
				y--;

			}
			loc[m/2][n/2]=num;
			x++;
			y--;
			mk--;
			nk--;
		}
	}
}
