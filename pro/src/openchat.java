import java.util.*;
class Solution {
    public ArrayList<String> solution(String[] record) {
        ArrayList<String> answer = new ArrayList<>();   //답변
        HashMap<String, String> idname = new HashMap<>();   //hashmap으로 id, name 저장
        String[] arr = {"","",""};  //record 쪼개 넣을 arr
        int index=0;    //answer의 index
        for(int i=0; i<record.length; i++){ //hashmap에 id, name 넣는 과정
            for(int k=0; k<arr.length; k++){    //arr 초기화
                arr[k]="";
            }
            arr=record[i].split(" ");   //띄어쓰기 단위로 끊어서
            if(arr[0].equals("Enter")){ //Enter로 시작하면
                idname.put(arr[1], arr[2]);
            }
            else if(arr[0].equals("Change")){   //Change로 시작하면
                idname.put(arr[1],arr[2]);
            }
        }
        for(int i=0; i<record.length; i++){     //answer 입력 과정
            for(int k=0; k<arr.length; k++){
                arr[k]="";
            }
            arr=record[i].split(" ");
            if(arr[0].equals("Enter")){
                answer.add(idname.get(arr[1])+"님이 들어왔습니다.");
                index++;
            }
            else if(arr[0].equals("Leave")){
                answer.add(idname.get(arr[1])+"님이 나갔습니다.");
                index++;
            }
        }
        return answer;
    }
}
