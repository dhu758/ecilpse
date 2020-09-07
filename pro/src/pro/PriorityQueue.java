import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        
        for(int i=0; i<scoville.length; i++){
            q.offer(scoville[i]);
        }
        while(q.peek()<K){
            if(q.size()<2){
            return -1;
        }
            q.offer(q.poll()+q.poll()*2);
            answer++;
        }
        
        return answer;
    }
}
