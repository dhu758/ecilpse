class Solution {
    public int solution(int n) {
        int answer = 0;
        int a=0, b=1;
        
        for(int =i=2; i<=n; i++){
            c=(a+b)%1234567;
            a=b%1234567;
            b=c%1234567;
        }
        
        return answer;
    }
}
