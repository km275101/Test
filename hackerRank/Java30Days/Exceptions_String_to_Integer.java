package Java30Days;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Exceptions_String_to_Integer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        try {
        	int i =  Integer.parseInt(S);
        	System.out.println(i);
        	
        }catch(Exception e) {
        	
        	System.out.println("Bad String");
        }
    }
}