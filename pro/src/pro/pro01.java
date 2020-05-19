package pro;

import java.util.Arrays;

public class pro01 {
	public static void main(String[] args) {
		int[] arr= {0,0,0};
		
		for(int i=0; i<3; i++) {
			double dValue=Math.random();
			arr[i]=(int)(dValue*10)+1;
			if(i==1) {
				while(arr[i]==arr[i-1]){
					arr[i]=(int)(dValue*10)+1;
				}
			}
			if(i==2) {
				while(arr[i]==arr[i-1]||arr[i]==arr[i-2]){
					arr[i]=(int)(dValue*10)+1;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
