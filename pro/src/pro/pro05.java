package pro;
import java.util.Scanner;
public class pro05 {
	public static void main(String[] args) {
		Scanner scann=new Scanner(System.in);
		System.out.println("Ȧ�� ������ �Է��ϼ���.");
		int n=scann.nextInt();
		OddMagicSquare odd = new OddMagicSquare(n);
		odd.make();
		odd.print();
	}
}
