package easy.e1369mostcommonword;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        //
        if(paragraph==null){
            return null;
        }
        paragraph=" "+paragraph.toLowerCase().trim()+" ";
        paragraph=paragraph.replaceAll("[,.?*!]"," ");
        for(String b:banned){
            paragraph=paragraph.replaceAll(" "+b+" "," ");
        }
        String[] array=paragraph.split(" ");
        Map<String,Integer> map=new HashMap<>();
        int maxCount=0;
        for(String s:array){
            String tmpS=s.trim();
            if(tmpS.length()>0){
                if(map.containsKey(tmpS)){
                    int count=map.get(tmpS)+1;
                    map.put(tmpS,count);
                    maxCount=maxCount>count?maxCount:count;
                }else{
                    map.put(tmpS,1);
                    maxCount=maxCount>1?maxCount:1;
                }
            }
        }
        Set<String> keySet=map.keySet();
        for(String key:keySet){
            if(map.get(key)==maxCount){
                return key;
            }
        }
        return null;

    }
}
