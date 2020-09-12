import java.util.*;
class Solution {
    public String solution(String new_id) {
        int n=0;
        String answer = "";
        new_id=new_id.toLowerCase();
        String[] puncts={"~","!","@","#","$","%","^","&","*","(",")","=","+","[",
                         "{","]","}",":","?",",","<",">","/"};
        for(String item:puncts){
            if(new_id.contains(item)){
                if(item.equals("*")||item.equals("+")||item.equals("$")){
                    item="["+item+"]";
                }
                if(item.equals("(")||item.equals(")")||item.equals("{")||item.equals("}")
                   ||item.equals("^")||item.equals("[")||item.equals("]")||item.equals("?")){
                    item="\\"+item;
                }
                new_id=new_id.replaceAll(item,"");
            }
        }
        while(new_id.contains("..")){
            new_id=new_id.replace("..",".");
            if(!new_id.contains("..")){
                break;
            }
        }
        if(new_id.startsWith(".")){
            if(new_id.length()>=2){
                new_id=new_id.substring(1);
            }
            else{
                new_id=new_id.replace(".","");
            }
        }
        if(new_id.endsWith(".")){
            if(new_id.length()>=2){
                new_id=new_id.substring(0,new_id.length()-1);
            }
            else{
                new_id=new_id.replace(".","");
            }
        }
        if(new_id.equals("")){
            new_id="a";
        }
        if(new_id.length()>=16){
            new_id=new_id.substring(0,15);
            if(new_id.endsWith(".")){
                new_id=new_id.substring(0,new_id.length());
             }
        }
        if(new_id.length()<=2){
            while(new_id.length()<=2){
                new_id=new_id+new_id.substring(new_id.length()-1);
                if(new_id.length()==3){break;}
            }
        }
        if(new_id.startsWith(".")){
            if(new_id.length()>=2){
                new_id=new_id.substring(1);
            }
            else{
                new_id=new_id.replace(".","");
            }
        }
        if(new_id.endsWith(".")){
            if(new_id.length()>=2){
                new_id=new_id.substring(0,new_id.length()-1);
            }
            else{
                new_id=new_id.replace(".","");
            }
        }
        answer= new_id;
        return answer;
    }
}
