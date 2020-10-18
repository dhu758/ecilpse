class Solution {

    static int[] arrN;

    public int solution(int n) {

        int answer = 0;

        arrN = new int[n+1];

        arrN[1] = 1;

        arrN[2] = 2;

        answer = dp(n);

        return answer;

    }

    private static int dp(int n){

        if(arrN[n]==0){

            arrN[n] = (dp(n-1)+dp(n-2))%1000000007;

        }

        return arrN[n];

    }

}


