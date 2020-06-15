package pro;

public class sub_floyd {
		int INF=9999;
		int w[][]= {{0,2,3,INF,7},
					{5,0,INF,INF,4},
					{2,INF,0,6,INF},
					{INF,INF,3,0,4},
					{6,1,7,2,0}};
	
	public void printmatrix() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(w[i][j]==INF) {
					System.out.printf(" INF"); continue;
				}
				System.out.printf("%4d", w[i][j]);
			}
			System.out.println();
		}
	}
	public void floydalgorithm() {
		for(int k=0; k<5; k++) {
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(w[i][j]>w[i][k]+w[k][j])
						w[i][j]=w[i][k]+w[k][j];
				}
			}
			System.out.println(k+"번째 정점까지만 거칠 수 있는 경우 모든 쌍에 대한 최단 경로");
			printmatrix();
		}
	}
	public static void main(String[] args) {
		sub_floyd f= new sub_floyd();
		f.floydalgorithm();
	}
}
