public class Solution {
    public int solution(int n) {
        int s=n,answer = 0;

        while(s!=0){
            answer+=n%10;
            s=n/10;
            n=s;
        }
 
        return answer;
    }
}
