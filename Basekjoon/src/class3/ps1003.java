package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps1003 {
	static Integer[][] dp = new Integer[41][2];	//index���� �Ǻ���ġ ���
	public static void main(String[] args) throws IOException{ //main �Լ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//scanner���� ����
		int T = Integer.parseInt(br.readLine());	//test case ����
		StringBuilder sb = new StringBuilder();
		dp[0][0]=1;	//0�� �Ǻ���ġ�� 0��� 1�� 
		dp[0][1]=0; //0�� �Ǻ���ġ�� 1��� 0��
		dp[1][0]=0; //1�� �Ǻ���ġ�� 0��� 0��
		dp[1][1]=1; //1�� �Ǻ���ġ�� 1��� 1��
		int number;
		for(int i=0; i<T; i++) {	//testcase��ŭ �ݺ�
			number = Integer.parseInt(br.readLine());	//number�Է¹ޱ�
			fibonacci(number);	//�Ǻ���ġ �Լ� ����
			sb.append(dp[number][0]+" "+dp[number][1]).append('\n');//��°� append
		}
		System.out.println(sb);
	}
	private static Integer[] fibonacci(int number) {	//�Ǻ���ġ �Լ�
		if(dp[number][0] == null || dp[number][1] == null) {//number�� �Ǻ���ġ �Լ����� �ϼ��Ǿ����� ������
			dp[number][0] = fibonacci(number-1)[0] + fibonacci(number-2)[0];//�Ǻ���ġ ����
			dp[number][1] = fibonacci(number-1)[1] + fibonacci(number-2)[1];
		}
		return dp[number];	//�Ǻ���ġ ��� �迭 ����
	}
	
}
