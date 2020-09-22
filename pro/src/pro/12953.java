import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        Arrays.sort(arr);   //오름차순 정렬
        for(int n=2; n<=arr[arr.length-2]; n++){    //2번째로 큰 수까지의 수들로 나누기
            int check=0; //공약수 확인을 위한 수
            for(int index=0; index <arr.length; index++){//모든 수에 대해
                if(arr[index]%n==0){//나뉜다면
                    arr[index] /= n;//값을 몫으로 변경
                    if(check==0){//처음으로 나뉘는 거라면
                        answer *= n;//answer에 곱하기
                    }
                    check++;//check 1증가
                    Arrays.sort(arr);//다시 정렬
                }
            }
            if(check>0){//약수로 나뉘었으면
                n--;//n 1감소(한번 더 확인하기 위해)
            }
        }
        for(int index=0; index<arr.length; index++){//남은 몫들 answer에 다 곱하기
            answer *= arr[index];   
        }
        return answer;
    }
}
