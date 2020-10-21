class Solution {

    static int answer;

    static int length;

    public int solution(int N, int number) {

        answer = -1;

        length = (int)(Math.log10(number)+1);

        dfs(N,number,0,0);

        return answer;

    }

    private static void dfs(int N, int number, int cnt, int result){

        if(cnt>8){

            return;

        }

        if(result==number){

            if(answer==-1||answer>cnt){

                answer=cnt;

            }

            return;

        }

        int tempN=N;

        for(int i=0; i<=length; i++){

            dfs(N,number, cnt+1+i, result+tempN);

            dfs(N,number, cnt+1+i, result-tempN);

            dfs(N,number, cnt+1+i, result*tempN);

            dfs(N,number, cnt+1+i, result/tempN);

            tempN = tempN*10+N;

        }

    }

}


