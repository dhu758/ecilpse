package pro;

public class pro02 {
	public static void main(String[] args) {
		int sum1=0, sum2=0;
		
		for(int i=1; i<=100; i++) {
			sum1+=i;
		}
		for(int j=1; j<=100; j++) {
			if(j%2!=0) {
				sum2+=j;
			}
		}
		System.out.println("1���� 100������ ��: "+sum1);
		System.out.println("1���� 100���� Ȧ���� ��: "+sum2);
	}
}
