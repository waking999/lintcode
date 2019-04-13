package easy.e1632countemailgroups;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int countGroups(List<String> emails) {
        // Write your code here

        Map<String,Integer> map=new HashMap<>();
        int count=0;
        for(String email:emails){
            int at=email.indexOf("@");
            String name=email.substring(0,at);
            String domain=email.substring(at);
            int plus=name.indexOf("+");
            if(plus!=-1){
                name=name.substring(0,plus);
            }
            name=name.replaceAll("[.]","");
            String real=name+domain;
            if(map.containsKey(real)){
                map.put(real,map.get(real)+1);
            }else{
                map.put(real,1);
            }
        }
        for(String key:map.keySet()){
            if(map.get(key)>1){
                count++;
            }
        }


        return count;
    }
}
