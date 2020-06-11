package pro;

public class gugudan_2arr {
	public static void main(String[] args) {
		int[][] arr=new int [9][9];
		int n=1;
		
		for(int i=0; i<9; i++) {
			arr[0][i]=n;
			arr[i][0]=n;
			n++;
		}
		
		for(int i=1; i<9; i++) {
			for(int j=1; j<9; j++) {
				arr[i][j]=arr[0][j]*arr[i][0];
			}
		}
		
		//Ãâ·Â
		for(int i=0; i<9; i++) {
			for(int j=0;j<9;j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}