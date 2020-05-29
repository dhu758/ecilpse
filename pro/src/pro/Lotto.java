package pro;

import java.util.Arrays;

public class Lotto {
		int[] arr;
		int[] lots;	//배열선언
		int base;	//전체 공 개수 45
		int ballNum;//저장할 공 개수 6
		//로또 공의 개수와 배열에 저장할 로또 공의 개수(배열의 크기) 저장하고, 배열 생성

		public Lotto(int base, int ballNum) {
			this.ballNum=ballNum;
			this.base=base;
			//배열 생성
			lots=new int[ballNum];
		}
		public Lotto() {	//공 개수 45, 배열크기 6으로 초기화
			this(45,6);
		}
		//일차원 배열 출력
		public void print() {
			for (int i=0; i<lots.length; i++) {
				if(i==lots.length-1) {
					System.out.printf("%d ",lots[i]);
				}else {
					System.out.printf("%d ",lots[i]);
				}
			}
			System.out.println();
		}
		//임의의 정수를 만들기
		private int rand() {
			return (int)(Math.random()*base)+1;
		}
		//n이 배열에 포함되는지 판단
		public boolean contain(int n) {
			boolean isC=false;
			for(int i=0; i<lots.length; i++) {
				if(lots[i]==n) {
					isC=true;
					break;
				}
			}
			return isC;
		}
		public void make() {
			Arrays.fill(lots, 0);
			int count=0;
			while(count!=ballNum) {
				int temp=rand();
				if(! contain(temp)) {
					lots[count++]=temp;
				}
			}
			Arrays.parallelSort(lots);
		}
		public int[] getLots() {
			return lots;
		}
		public static void main(String[] args) {
		Lotto lot=new Lotto(45,6);
		lot.make();
		lot.print();
		}
}