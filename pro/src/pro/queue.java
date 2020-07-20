import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for(int i=0; i<priorities.length; i++){
            queue.offer(priorities[i]);
        }
        
        Arrays.sort(priorities);
        int end_idx=priorities.length-1;
        int minus_idx=0;
        while(!queue.isEmpty()){
            int num=queue.poll();
            if(num==priorities[end_idx-minus_idx]){
                location--;
                minus_idx++;
                answer++;
                if(location<0)
                    break;
            }
            else{
                queue.offer(num);
                location--;
                if(location<0){
                    location=queue.size()-1;
                }
            }
        }
        
        return answer;
    }
}
