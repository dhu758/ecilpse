class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer=dfs(numbers, target, 0, 0);  //dfs 함수 돌리기
        return answer;
    }
    public int dfs(int[] numbers, int target, int index, int sum){
        if(index==numbers.length){  //인덱스가 배열의 길이와 같으면(모든 노드 다 돌았으면) 종료
            if(sum==target){    //sum이 target이랑 같으면
                return 1;   //1 반환
            }
            return 0;
        }
        return dfs(numbers, target, index+1, sum+numbers[index])+
            dfs(numbers, target, index+1, sum-numbers[index]);  //두 갈래로 나뉘어짐
    }
}
