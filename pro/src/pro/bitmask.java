import java.util.*;
class Solution {
    public int solution(String[][] relation) {
        int colLen = relation[0].length;    //열의 길이
        int rowLen = relation.length;       //행의 길이
        HashSet<String> selects = new HashSet<String>();//행 넣을 set
        HashSet<Integer> candidates = new HashSet<Integer>();//후보키 set
        
        //2진법으로 부분 집합 만들기
        //[학번]은 0001이고 [이름, 전공]은 0110이다.
        for(int biSet=1; biSet<(1<<colLen); biSet++){
            //1<<colLen은 1을 왼쪽으로 colLen번 shift한 수
            selects.clear();
            //행 넣을 set 비우고
            for(int r=0; r<rowLen; r++){
                String data="";
                for(int th=0; th<colLen; th++){
                    if((biSet&(1<<th))!=0){
                        //biSet에서 th번째 자리수가 1이면
                        data += relation[r][th]+",";
                    }
                }
                selects.add(data);
                System.out.println(selects); 
            }
            if(selects.size()==rowLen){ 
                //길이가 같다는것은 행끼리 중복이 없고 모든 튜플을 식별할수있다는뜻
                //set은 중복이 안되므로
                push(candidates, biSet);
            }
        }
        return candidates.size();
    }
    static void push(HashSet<Integer> candidates, int set){
        for(int key:candidates){
            if((key&set)==key){
                //교집합이 key이면 set이 key를 포함한거여서 제외(최소성)
                return;
            }
        }
        candidates.add(set);
    }
}
