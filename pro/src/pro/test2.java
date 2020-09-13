import java.util.*;
class Solution {
    public int solution(int[][] boxes) {
        int answer = 0;
        HashMap<Integer, Integer> map0 = new HashMap<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        // map0.put(boxes[0][0],0);
        // map1.put(boxes[0][1],0);
        for(int i=0; i<boxes.length; i++){
            if(map0.containsKey(boxes[i][0])){
                map0.put(boxes[i][0],map0.get(boxes[i][0])+1);
            }
            else{
                map0.put(boxes[i][0],1);
            }
            if(map1.containsKey(boxes[i][1])){
                // map1.put(boxes[i][0],map1.get(boxes[i][0])+1);
            }
            else{
                map1.put(boxes[i][1],1);
            }
        }
        // int min_length;
        // if(map0.size>map1.size){
        //     min_length
        // }
		// Object[] mapkey = map0.keySet().toArray();
		// Arrays.sort(mapkey);
        for(int key:map0.keySet()){
            if(map1.containsKey(key)){
                if(map0.get(key)>map1.get(key)){
                    map0.put(key, map0.get(key)-map1.get(key));
                }
                map0.put(key, map1.get(key)-map0.get(key));
            }
        }
        
        for(int key:map0.keySet()){
            answer+=map0.get(key);   
        }
        return answer;
    }
}
