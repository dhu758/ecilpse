package class3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ps1931 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] times = new int[N][2];
		for(int i=0;i<N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			times[i][0]= x;
			times[i][1]= y;
		}
		Arrays.sort(times, new Comparator<int[]>() {
			@Override
			public int compare(int[] t1, int[] t2) {
				if(t1[1]==t2[1]) {
					return t1[0]-t2[0];
				}
				return t1[1]-t2[1];
			}
		});
		int end=times[0][1];
		int answer=1;
		for(int i=1;i<N; i++) {
			if(times[i][0]>=end) {
				end=times[i][1];
				answer++;
			}
		}
		System.out.println(answer);
	}
}
