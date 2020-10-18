package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps1003 {
	static Integer[][] dp = new Integer[41][2];	//index값의 피보나치 결과
	public static void main(String[] args) throws IOException{ //main 함수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//scanner보다 빠름
		int T = Integer.parseInt(br.readLine());	//test case 개수
		StringBuilder sb = new StringBuilder();
		dp[0][0]=1;	//0의 피보나치는 0출력 1번 
		dp[0][1]=0; //0의 피보나치는 1출력 0번
		dp[1][0]=0; //1의 피보나치는 0출력 0번
		dp[1][1]=1; //1의 피보나치는 1출력 1번
		int number;
		for(int i=0; i<T; i++) {	//testcase만큼 반복
			number = Integer.parseInt(br.readLine());	//number입력받기
			fibonacci(number);	//피보나치 함수 실행
			sb.append(dp[number][0]+" "+dp[number][1]).append('\n');//출력값 append
		}
		System.out.println(sb);
	}
	private static Integer[] fibonacci(int number) {	//피보나치 함수
		if(dp[number][0] == null || dp[number][1] == null) {//number의 피보나치 함수값이 완성되어있지 않으면
			dp[number][0] = fibonacci(number-1)[0] + fibonacci(number-2)[0];//피보나치 적용
			dp[number][1] = fibonacci(number-1)[1] + fibonacci(number-2)[1];
		}
		return dp[number];	//피보나치 결과 배열 리턴
	}
	
}
