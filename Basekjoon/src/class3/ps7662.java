package class3;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.PriorityQueue;
//import java.util.Scanner;
//
//public class ps7662 {
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		PriorityQueue<Integer> maxHeap;
//        PriorityQueue<Integer> minHeap;
//        int T = sc.nextInt();
//        int insertNum=0;
//        int deleteNum=0;
//        ArrayList<String> answer = new ArrayList<>();
//        for(int caseNum=0; caseNum<T; caseNum++) {
//        	maxHeap = new PriorityQueue<>(Collections.reverseOrder());
//        	minHeap = new PriorityQueue<>();
//        	insertNum=0;
//        	deleteNum=0;
//        	int k = sc.nextInt();
//        	for(int i=0; i<k; i++) {
//        		String st = sc.next();
//        		int n = sc.nextInt();
//        		if(st.equals("I")) {
//        			maxHeap.offer(n);
//        			minHeap.offer(n);
//        			insertNum++;
//        		}
//        		else if(st.equals("D")) {
//        			if(insertNum>deleteNum) {
//	        			if(n==1) {
//	        				maxHeap.poll();
//	        				deleteNum++;
//	        			}
//	        			else if(n==-1) {
//	        				if(!minHeap.isEmpty()) {
//	        					minHeap.poll();
//	        					deleteNum++;
//	        				}
//	        			}
//        			}
//        		}
//        	}
//        	if(insertNum==deleteNum) {
//        		answer.add("EMPTY");
//        	}
//        	else if(insertNum>deleteNum) {
//        		answer.add(Integer.toString((maxHeap.poll()))+" "+Integer.toString((minHeap.poll())));
//        	}
//        }
//        for(int i=0; i<answer.size(); i++) {
//        	System.out.println(answer.get(i));
//        }
//	}
//}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

class ps7662 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());

		for(int tc=1; tc<=T; tc++){
			int num = Integer.parseInt(br.readLine());
			
			TreeMap<Integer, Integer> treemap = new TreeMap<>();

			for(int i=0; i<num; i++){
				String[] temp = br.readLine().split(" ");
				
				int input = Integer.parseInt(temp[1]);
				switch(temp[0]){
					case "I":
						if(treemap.containsKey(input))
							treemap.put(input, treemap.get(input)+1);
						else
							treemap.put(input, 1);
						break;
					case "D":
						if(treemap.size() != 0){
							if(input == -1){
								int min = treemap.firstKey();
								if(treemap.get(min) == 1)
									treemap.remove(min);
								else
									treemap.put(min, treemap.get(min)-1);
							}
							else{
								int max = treemap.lastKey();
								if(treemap.get(max) == 1)
									treemap.remove(max);
								else
									treemap.put(max, treemap.get(max)-1);
							}
						}
						break;
				}
			}

			if(treemap.isEmpty())
				sb.append("EMPTY\n");
			else if(treemap.size() == 1)
				sb.append(treemap.firstKey() + " " + treemap.firstKey());
			else
				sb.append(treemap.lastKey() + " " + treemap.firstKey());
		}
		System.out.println(sb.toString());
	}
}