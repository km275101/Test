package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegExTestHard1 {
	
    public boolean isMatch(String s, String p) {
        Pattern p1 = Pattern.compile(s);
        Matcher m = p1.matcher(p);
        System.out.println(m.find());
        if(m.find()){
        System.out.println(m.group());
        return true;
       
        }
		return true;
    }
    
    public static void main(String args[]){
    	RegExTestHard1 s = new RegExTestHard1();
        s.isMatch("aa","\\s[a-z]*");
        
    }
}
