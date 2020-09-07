import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        ArrayList<Integer> reserve_list = new ArrayList<>();
        
        for(int i=0; i<reserve.length; i++){
            reserve_list.add(reserve[i]);
        }
        
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve_list.size(); j++){
                if(lost[i]==reserve_list.get(j)){
                    lost[i]=-1;
                    reserve_list.remove(j);
                    answer++;
                    break;
                }
            }
        }
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve_list.size(); j++){
                if((lost[i]-1)==reserve_list.get(j)||(lost[i]+1)==reserve_list.get(j)){
                    reserve_list.remove(j);
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}
