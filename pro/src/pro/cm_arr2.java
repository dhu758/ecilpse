package pro;

public class cm_arr2 {
	public static void main(String[] args) {
		double[] arr= {1, 0.01, 0.3937007874015748, 0.032808398950, 0.010936132983, 0.000006213712};
		double[][] ans_arr= new double[6][6];
		
		for(int i=0; i<arr.length; i++) {
			double num=1/arr[i];
			ans_arr[i][0]=Math.round(num*100)/100.0;
		}
		
		for(int i=0; i<ans_arr.length; i++) {
			for(int j=0; j<arr.length; j++)
			ans_arr[i][j]=ans_arr[i][0]*arr[j];
		}
		
		for(int i=0; i<ans_arr.length; i++) {
			for(int j=0; j<arr.length; j++)
			System.out.printf("%-20.12f",ans_arr[i][j]);
		System.out.println();
		}
	}
}
