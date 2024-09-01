package string;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveVowelsFromString {

    public static String scoreOfString(String s) {
      StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        HashMap<Character, Integer> hs = new HashMap<>();

        for (int i = 0; i < ch.length; i++) {
            if(! (ch[i] == 'a' | ch[i] == 'e' | ch[i] == 'i' | ch[i] == 'o'
            | ch[i] == 'u')){
                sb.append(ch[i]);
            }


        }
        return sb.toString();

    }

    public static void main (String args[]){

       System.out.println(scoreOfString("leetcodeisacommunityforcoders"));
    }

}

