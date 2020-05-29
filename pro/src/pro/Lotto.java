package pro;

import java.util.Arrays;

public class Lotto {
		int[] arr;
		int[] lots;	//�迭����
		int base;	//��ü �� ���� 45
		int ballNum;//������ �� ���� 6
		//�ζ� ���� ������ �迭�� ������ �ζ� ���� ����(�迭�� ũ��) �����ϰ�, �迭 ����

		public Lotto(int base, int ballNum) {
			this.ballNum=ballNum;
			this.base=base;
			//�迭 ����
			lots=new int[ballNum];
		}
		public Lotto() {	//�� ���� 45, �迭ũ�� 6���� �ʱ�ȭ
			this(45,6);
		}
		//������ �迭 ���
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
		//������ ������ �����
		private int rand() {
			return (int)(Math.random()*base)+1;
		}
		//n�� �迭�� ���ԵǴ��� �Ǵ�
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