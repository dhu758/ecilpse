class Solution {
    public int solution(int n) {
        int answer = n;
        String n2 = Integer.toBinaryString(n);
        int n2Num=0, answerNum=0;
        for(int i=0; i<n2.length(); i++){
            if(n2.charAt(i)=='1'){
                n2Num++;
            }
        }
        while(n2Num!=answerNum){
            answer++;
            String answer2 = Integer.toBinaryString(answer);
            answerNum=0;
            for(int i=0; i<answer2.length(); i++){
              if(answer2.charAt(i)=='1'){
                    answerNum++;
                }
            }
        }
        
        return answer;
    }
}
