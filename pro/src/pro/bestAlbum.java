import java.util.*;
class Solution {
    public ArrayList solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> genreNum = new HashMap<>();
        for(int i=0; i<genres.length; i++){
            if(genreNum.containsKey(genres[i])){
                genreNum.put(genres[i], genreNum.get(genres[i])+plays[i]);
            }
            else{
                genreNum.put(genres[i], plays[i]);
            }
        }
        List<String> keySetList = new ArrayList<>(genreNum.keySet());
        Collections.sort(keySetList, (o1, o2) -> (genreNum.get(o2).compareTo(genreNum.get(o1))));
        int max1=0, max2=0, index1=0, index2=0;
        int num=0;
        for(String key : keySetList) {
            max1=0; max2=0; index1=0; index2=0; num=0;
                for(int i=0; i<genres.length; i++){
                    if(key.equals(genres[i])){
                        num++;
                        if(plays[i]>max1){
                            max2=max1;
                            index2=index1;
                            max1=plays[i];
                            index1=i;
                        }
                        else if(plays[i]>max2){
                            max2=plays[i];
                            index2=i;
                        }
                    }
                }
            if(num==1){
                answer.add(index1);
            }
            else{
                answer.add(index1);
                answer.add(index2);
            }
        }
        return answer;
    }
}
