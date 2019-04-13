package easy.e1713uniqueemailaddresses;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numUniqueEmails(String[] emails) {
        // write your code here
        Set<String> set=new HashSet<>();

        for(String email:emails){
            int at=email.indexOf('@');
            String domain=email.substring(at);

            String name=email.substring(0,at);
            int plus=name.indexOf('+');
            if(plus!=-1){
                name=name.substring(0,plus);
            }
            name=name.replaceAll("\\.","");
            set.add(name+domain);

        }

        return set.size();
    }
}
