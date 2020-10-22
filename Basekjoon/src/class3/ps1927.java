package class3;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ps1927 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> answer = new ArrayList<>();
		PriorityQueue<Integer> q =new PriorityQueue<>();
		for(int i=0; i<N; i++) {
			int num = sc.nextInt();
			if(num>0) {
				q.offer(num);
			}
			if(num==0&&!q.isEmpty()) {
				answer.add(q.poll());
			}
			else if(num==0&&q.isEmpty()) {
				answer.add(0);
			}
		}
		for(int i=0; i<answer.size(); i++) {
			System.out.println(answer.get(i));
		}
	}
}
