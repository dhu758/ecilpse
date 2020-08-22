import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] ch = new char[s.length()];
        
        for(int i=0; i<ch.length; i++){
            ch[i]=s.charAt(i);
        }
        Arrays.sort(ch);
        
        for(int i=0; i<ch.length; i++){
            answer = s.charAt(i)+answer;
        }
        
        return answer;
    }
}
