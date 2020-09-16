class Solution {
    public int solution(String name) {
        int answer = 0;
        int[] nameAscii = new int[name.length()];   //아스키코드 넣을 배열
        for(int i=0; i<nameAscii.length; i++){  //아스키코드 넣기
            nameAscii[i]=(int)name.charAt(i);
        }
        int index=0;
        int end=nameAscii.length-1;
        int n=0;    //왼쪽으로 한번 턴하면 증가
        while(index!=end){
            if(nameAscii[index]==65){//'A'일 때
                int left=index, right=index;
                int leftCount=0, rightCount=0;
                while(nameAscii[left]==65){ //왼쪽으로 가면
                    if(left==0){
                        left=nameAscii.length-1;
                    }
                    else{
                        left--;
                    }
                    leftCount++;
                    if(left==index){
                        return answer;
                    }
                }
                while(nameAscii[right]==65){    //오른쪽으로 가면
                    if(n<1&&index!=(nameAscii.length-1)&&right==(nameAscii.length-1)){
                        return answer;
                    }
                    if(right==(nameAscii.length-1)){
                        break;
                    }
                    right++;
                    rightCount++;
                }
                if(n>0){    //한번 왼쪽 턴했음 계속 왼쪽
                    index=left;
                    answer+=leftCount;
                }
                else if(leftCount>=rightCount){//오른쪽 이동
                    index=right;
                    answer+=rightCount;
                }
                else{//왼쪽 이동
                    end=right-1;
                    index=left;
                    answer+=leftCount;
                    n++;
                }
            }
            if((nameAscii[index]-65)>(91-nameAscii[index])){    //알파벳 변경 부분
                answer+=(91-nameAscii[index]);
            }
            else{
                answer+=(nameAscii[index]-65);
            }
            nameAscii[index]=65;
        }
        
        return answer;
    }
}
