import java.util.*;

class Solution {

    public int solution(String[][] relation) {                              //main함수

        candidates = new ArrayList<HashSet<Integer>>();

        select(0, new HashSet<Integer>(), relation);

        return candidates.size();

    }

    //select(): column에 대한 모든 부분 집합을 만든다.

    //pes번째 열, selects: dfs에서 만들어지는 부분 집합

    static ArrayList<HashSet<Integer>> candidates;

    static void select(int pos, HashSet<Integer> selects, String[][] relation){

        if(pos==relation[0].length){                    //만들어진 selects가 다른 후보키를 포함하는지,최소성

            for(int i=0; i<candidates.size(); i++){

                if(selects.containsAll(candidates.get(i))){

                    return;

                }

            }

            //selects가 유일성을 만족하는지

            HashSet<String> sets = new HashSet<String>();

            for(int row=0; row<relation.length; row++){

                String temp="";

                for(int col : selects){

                    temp+=relation[row][col]+","; //selects에 있는 col집합의 row번째 row 합친거

                }

                if(sets.contains(temp)){    //이미 있다면 유일성 규칙에 어긋

                    return;

                }

                sets.add(temp); //아니면 sets에 추가

            }

            candidates.add(selects);    //return 안되고 왔으면 후보키에 추가시킴

            return;

        }

        HashSet<Integer> copy = new HashSet<Integer>(); //dfs 나눌 줄기1

        HashSet<Integer> copy2 = new HashSet<Integer>(); //dfs 나눌 줄기2

        for(int val: selects){  //selects에 있는거 다 copy, copy2에 넣기

            copy.add(val);

            copy2.add(val);

        }

        select(pos+1, copy2, relation); //pos번째 포함X

        copy.add(pos);

        select(pos+1, copy, relation);  //pos번째 포함O

    }

}


