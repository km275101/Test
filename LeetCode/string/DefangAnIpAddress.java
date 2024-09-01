package string;

import java.util.HashMap;

public class DefangAnIpAddress {

    public static String defangIPaddr(String s) {
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == '.'){
                sb.append("[.]");
            }else{
                sb.append(ch[i]);
            }

        }
        return sb.toString();

    }

    public static String defangIPaddr1(String s) {

        String str = s.replace("." , "[.]");
        return  str;

    }

    public static void main (String args[]){

        System.out.println(defangIPaddr("1.1.1.1"));

        System.out.println(defangIPaddr1("1.1.1.1"));

    }

}

