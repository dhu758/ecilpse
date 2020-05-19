package pro;

public class pro07 {
	public static void main(String[] args) {
		int sum1, sum2;
		for(int i=2; i<10000; i++) {//a
			sum1=0;
			sum2=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					sum1+=j;//b
				}
			}
			sum1-=i;
			for(int k=1; k<=sum1; k++) {
				if(sum1%k==0) {
					sum2+=k;//c
				}
			}
			sum2-=sum1;
			if(i<sum1) {
				if(i==sum2) {
					System.out.print("("+i+","+sum1+")"+"는 친화수: [");
					for(int j=1; j<=i; j++) {
						if(i%j==0) {
							System.out.print(j+",");
						}
					}
					System.out.println("]");
					System.out.print("[");
					for(int k=1; k<=sum1; k++) {
						if(sum1%k==0) {
							System.out.print(k+",");
						}
					}
					System.out.println("]");
				}
			}
		}
	}
}