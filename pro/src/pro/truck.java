import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int in_index=0, out_index=0, current_bridge=0, answer = 0;
        Queue<Integer> bridge_trucks = new LinkedList<Integer>();   //다리에 있는 트럭
        int[] time = new int[truck_weights.length]; //트럭이 건너고있는 시간
        bridge_trucks.add(truck_weights[0]); time[0]++; current_bridge=truck_weights[0]; answer++;
        // 첫번째 트럭 건너게 하기

        while(out_index<truck_weights.length&&in_index<truck_weights.length){
            //다리에 트럭을 있을때까지 반복
            for(int i=out_index; i<=in_index; i++) {time[i]++;}
            //건너고 있는 모든 트럭 시간+1
            answer++;
            if(time[out_index]==(bridge_length+1)){    //나갈 트럭
                bridge_trucks.poll();
                current_bridge -= truck_weights[out_index];
                out_index++;
            } 
            if(in_index<truck_weights.length-1&&(current_bridge+truck_weights[in_index+1])<=weight){ 
                //다음 트럭도 건너게 할 수 있으면
                in_index++; //다음 들어갈 인덱스+1
                current_bridge += truck_weights[in_index]; //그 트럭도 현재 다리 무게에 추가
                time[in_index]++;   //그 트럭 건너고있는 시간+1
                bridge_trucks.add(truck_weights[in_index]); //큐에 넣기
            }
        }
        
        return answer;
    }
}
