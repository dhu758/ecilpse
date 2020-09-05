import java.util.*;
class Solution {
    public ArrayList solution(int[] answers) {
        ArrayList answer=new ArrayList();
        int[] answers1={1,2,3,4,5}; 
        int[] answers2={2,1,2,3,2,4,2,5}; 
        int[] answers3={3,3,1,1,2,2,4,4,5,5};
        int sum1=0, sum2=0, sum3=0;
        int index1=0, index2=0, index3=0;
        
        for(int i=0; i<answers.length; i++){    //정답이 맞는지 다 돌려보기
            if(answers[i]==answers1[index1]){
                sum1++;
            }
            if(answers[i]==answers2[index2]){
                sum2++;
            }
            if(answers[i]==answers3[index3]){
                sum3++;
            }
            if(index1==answers1.length-1) {index1=0;} else{index1++;}
            if(index2==answers2.length-1) {index2=0;} else{index2++;}
            if(index3==answers3.length-1) {index3=0;} else{index3++;}
        }
        int[] sums = {sum1, sum2, sum3};
        int[] sort_sums = {sum1, sum2, sum3};
        Arrays.sort(sort_sums); //올림차순 정렬
        
        for(int i=0; i<3; i++){
            if(sort_sums[2]==sums[i])
                answer.add(i+1);
        }
        
        return answer;
    }
}
