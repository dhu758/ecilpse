package pro;

public class AmicableNumber {
	public static void main(String[] args) {
		int a,b,sumA=0,sumB=0;
		
		for(int i=2; i<10000; i++) {
			sumA=0;
			sumB=0;
			a=i;
			for(int j=1; j<a; j++) {
				if(a%j==0) {
					sumA=sumA+j;
				}
			}
			b=sumA;
			if(a<b) {
				for(int k=1; k<b; k++) {
					if(b%k==0) {
						sumB=sumB+k;
					}
				}
				if(sumB==a) {
					System.out.println(a+"와 "+b+"는 친화수입니다.");
				}
			}
		}
	}
}
