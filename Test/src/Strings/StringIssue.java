package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringIssue {
	
	public static void main(String args[]){
		
		 String str = "{sharedobject.QUERY10860}.2 {sharedobject.QUERY11141}.1";
		 
		 
		 String[] split = str.split( " " );
		 System.out.println(split[0]);
		 System.out.println(split[1]);
		 int count = 0;
		 Pattern pattern = Pattern.compile("\\{sharedobject.");
		 Matcher m = pattern.matcher(str);
		 while (m.find()) {
		             count++;
		 }
		 System.out.println(count);
		 int j , indexToRetrieve = 0;
		 for(j = 0 ; j<count;j++) {
		 str = split[j];
		 String index = str.substring(str.indexOf("}.")+2, str.length());
		 indexToRetrieve=Integer.valueOf(index);
		 System.out.println(index);
		 System.out.println(indexToRetrieve);
		 }
		 

		
		
	}

}
