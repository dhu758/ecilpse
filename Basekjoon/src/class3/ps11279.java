package class3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ps11279 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		ArrayList<Integer> answer = new ArrayList<>();
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			int num = sc.nextInt();
			if(num>0) {
				q.offer(num);
			}
			else if(num==0) {
				if(q.isEmpty()) {
					answer.add(0);
				}
				else {
					answer.add(q.poll());
				}
			}
		}
		for(int i=0; i<answer.size(); i++) {
			System.out.println(answer.get(i));
		}
	}
}
