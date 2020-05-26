package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringIssue {
	
	public static void main(String args[]){
		
		 String str = "{sharedobject.QUERY10860}.2 {sharedobject.QUERY11141}.1";
		 
		 String message = "The document (Purchase Order) PO51 was submitted for approval.";
		 String[] split = message.split( "\\) " );
		 String[] split1 = split[1].split( " " );
		 System.out.println(split1[0]);
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
		 String index = str.substring(str.indexOf("}.")+2, str.length()); // Fetching the integer value after dot
		 indexToRetrieve=Integer.valueOf(index);
		 System.out.println(index);
		 System.out.println(indexToRetrieve);
		 }
		 
		 
		 // Another test
		 // Removing comma from the start of a string
		 
		 String test = ", b_name INOUT String";
		 
		boolean b = test.startsWith(",");
		if(b){
			test = test.substring(1);
			System.out.println(test);
			System.out.println(test.trim());
		}
		 
	}

}
